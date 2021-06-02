package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

@SuppressWarnings("SqlNoDataSourceInspection")
public class WeatherDatabase {

    private String ipAddress;
    private String databaseName;
    private String username;
    private String password;

    private Connection conn;
    private Statement statement;

    private final String[] locationName = {"LienChiang", "KinMen", "PenGhu", "TaipeiCity",
            "NewTaipeiCity", "TaoYuanCity", "HsinChuCity", "HsinChuCounty",
            "MiaoLiCounty", "TaichungCity", "ChangHuaCounty", "YunLinCounty",
            "ChiaYiCounty", "ChiaYiCity", "TaiNanCity", "kaoHsiungCity",
            "PingTungCounty", "TaiTungCounty", "HuaLienCounty", "YiLanCounty",
            "KeeLungCity", "NanTouCounty", "HengChun"};

    public WeatherDatabase(String ipAddress, String databaseName, String username, String password) {
        this.ipAddress = ipAddress;
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
        init();
    }

    public String[] getLocationName() {
        return locationName;
    }

    public Connection getConn() {
        return conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public boolean dbConnect() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://" + ipAddress + ";databaseName=" + databaseName, username, password);
            System.out.println("Database Connected | " + LocalDateTime.now());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void dbDisconnect() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection Closed | " + LocalDateTime.now());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean statementOpen() {
        if (conn == null) {
            System.out.println("Database not connected | " + LocalDateTime.now());
            return false;
        } else {
            try {
                statement = conn.createStatement();
                System.out.println("Statement Open | " + LocalDateTime.now());
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public void statementClose() {
        if (statement == null) {
            System.out.println("Statement didn't open | " + LocalDateTime.now());
        } else {
            try {
                statement.close();
                System.out.println("Statement Closed | " + LocalDateTime.now());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void init() {
        if (!dbConnect()) {
            System.out.println("Fail to connected | " + LocalDateTime.now());
        } else {
            if (!statementOpen()) {
                System.out.println("Fail to open statement | " + LocalDateTime.now());
            } else {
                for (int i = 0; i < locationName.length; i++) {
                    createCurrentlyForecastTable(locationName[i]);
                    createHourlyForecastTable(locationName[i] + "HourlyWeatherForecast");
                    createDailyForecastTable(locationName[i] + "DailyWeatherForecast");
                    create30DaysForecastTable(locationName[i]);
                }
                createEarthquakeTable();
            }
        }
    }

    private void createDailyForecastTable(String tableName) {
        if (statement == null) {
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + tableName + "]') AND type in (N'U')) CREATE TABLE " + tableName + "(" +
                        "dt BIGINT,  sunrise BIGINT, sunset BIGINT, moonrise BIGINT,  moonset BIGINT,  moon_phase FLOAT, " +
                        "temp_min FLOAT, temp_max FLOAT, temp_eve FLOAT, temp_night FLOAT, temp_day FLOAT, temp_morn FLOAT," +
                        "feels_like_eve FLOAT, feels_like_night FLOAT, feels_like_day FLOAT, feels_like_morn FLOAT, " +
                        "uvi FLOAT, pressure INTEGER, clouds INTEGER, pop FLOAT, humidity INTEGER, dew_point FLOAT," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT, wind_speed FLOAT, " +
                        "weather_icon VARCHAR(100), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void createHourlyForecastTable(String tableName) {
        if (statement == null) {
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + tableName + "]') AND type in (N'U')) CREATE TABLE " + tableName + "(" +
                        "dt BIGINT,temp FLOAT, feels_like FLOAT, uvi FLOAT, " +
                        "pressure INTEGER, clouds INTEGER, pop FLOAT, humidity INTEGER, visibility INTEGER,  dew_point FLOAT," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT, wind_speed FLOAT, " +
                        "weather_icon VARCHAR(100), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void createCurrentlyForecastTable(String locationName) {
        if (statement == null) {
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + locationName + "CurrentlyWeather" + "]') AND type in (N'U')) CREATE TABLE " + locationName + "CurrentlyWeather" + "(" +
                        "dt BIGINT, sunrise BIGINT, sunset BIGINT, " +
                        "temp FLOAT, feels_like FLOAT, pressure FLOAT, humidity INTEGER, temp_min FLOAT, temp_max FLOAT, sea_level FLOAT, grnd_level FLOAT, visibility INTEGER, " +
                        "aqi FLOAT, ap_co FLOAT, ap_no FLOAT, ap_no2 FLOAT, ap_o3 FLOAT, ap_so2 FLOAT, ap_pm2_5 FLOAT, ap_pm10 FLOAT, ap_nh3 FLOAT," +
                        "wind_speed FLOAT, wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT," +
                        "clouds INTEGER, " +
                        "weather_icon VARCHAR(100), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void create30DaysForecastTable(String locationName) {
        if (statement == null) {
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + locationName + "30DaysWeatherForecast" + "]') AND type in (N'U')) CREATE TABLE " + locationName + "30DaysWeatherForecast" + "(" +
                        "dt BIGINT, sunrise BIGINT ,sunset BIGINT, " +
                        "temp_min FLOAT, temp_max FLOAT, temp_eve FLOAT, temp_night FLOAT, temp_day FLOAT, temp_morn FLOAT," +
                        "feels_like_eve FLOAT, feels_like_night FLOAT, feels_like_day FLOAT, feels_like_morn FLOAT, " +
                        "pressure INTEGER, clouds INTEGER, humidity INTEGER," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_speed FLOAT, " +
                        "rain FLOAT, snow FLOAT, " +
                        "weather_icon VARCHAR(100), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void createEarthquakeTable() {
        if (statement == null) {
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[earthquake]') AND type in (N'U')) CREATE TABLE earthquake " +
                        "(earthquakeNo BIGINT, reportColor NVARCHAR(5), reportContent NVARCHAR(100) , originTime VARCHAR(30)," +
                        "depth_value FLOAT , magnitudeValue FLOAT)");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
