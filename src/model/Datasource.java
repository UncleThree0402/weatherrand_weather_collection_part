package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Datasource {
    private static String ipAddress;
    private static String databaseName;
    private static String username;
    private static String password;

    private Connection conn;
    private Statement statement;

    public static String getIpAddress() {
        return ipAddress;
    }

    public static void setIpAddress(String ipAddress) {
        Datasource.ipAddress = ipAddress;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        Datasource.databaseName = databaseName;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Datasource.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Datasource.password = password;
    }

    public Connection getConn() {
        return conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public boolean dbConnect() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://" + Datasource.ipAddress + ";databaseName=" + Datasource.databaseName, Datasource.username, Datasource.password);
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
        if(statement == null){
            System.out.println("Statement didn't open | " + LocalDateTime.now());
        } else {
            try{
                statement.close();
                System.out.println("Statement Closed | " + LocalDateTime.now());
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void createDailyForecastTable(String tableName){
        if(statement ==null){
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + tableName + "]') AND type in (N'U')) CREATE TABLE " + tableName + "(_id INTEGER IDENTITY , " +
                        "dt BIGINT, monthDayDt VARCHAR(20), sunrise BIGINT, hourMinSr VARCHAR(20) ,sunset BIGINT, hourMinSs VARCHAR(20) ,moonrise BIGINT, hourMinMr VARCHAR(20), moonset BIGINT, hourMinMs VARCHAR(20), moon_phase FLOAT, " +
                        "temp_min FLOAT, temp_max FLOAT, temp_eve FLOAT, temp_night FLOAT, temp_day FLOAT, temp_morn FLOAT," +
                        "feels_like_eve FLOAT, feels_like_night FLOAT, feels_like_day FLOAT, feels_like_morn FLOAT, " +
                        "uvi FLOAT, pressure INTEGER, clouds INTEGER, pop FLOAT, humidity INTEGER, dew_point FLOAT," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT, wind_speed FLOAT, " +
                        "weather_icon VARCHAR(20), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void createHourlyForecastTable(String tableName){
        if(statement ==null){
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + tableName + "]') AND type in (N'U')) CREATE TABLE " + tableName + "(_id INTEGER IDENTITY, " +
                        "dt BIGINT, hourDt VARCHAR(20), temp FLOAT, feels_like FLOAT, uvi FLOAT, " +
                        "pressure INTEGER, clouds INTEGER, pop FLOAT, humidity INTEGER, visibility INTEGER,  dew_point FLOAT," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT, wind_speed FLOAT, " +
                        "weather_icon VARCHAR(20), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void createCurrentlyForecastTable(String locationName){
        if(statement ==null){
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + locationName + "CurrentlyWeather" + "]') AND type in (N'U')) CREATE TABLE " + locationName + "CurrentlyWeather" + "(_id INTEGER IDENTITY, " +
                        "dt BIGINT,  hourMinDt VARCHAR(20), sunrise BIGINT, hourMinSr VARCHAR(20) , sunset BIGINT, hourMinSs VARCHAR(20) ," +
                        "temp FLOAT, feels_like FLOAT, pressure FLOAT, humidity INTEGER, temp_min FLOAT, temp_max FLOAT, sea_level FLOAT, grnd_level FLOAT, visibility INTEGER, " +
                        "aqi FLOAT, ap_co FLOAT, ap_no FLOAT, ap_no2 FLOAT, ap_o3 FLOAT, ap_so2 FLOAT, ap_pm2_5 FLOAT, ap_pm10 FLOAT, ap_nh3 FLOAT," +
                        "wind_speed FLOAT, wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_gust FLOAT," +
                        "clouds INTEGER,  rain_1h FLOAT, rain_3h FLOAT, snow_1h FLOAT, snow_3h FLOAT," +
                        "weather_icon VARCHAR(20), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void create30DaysForecastTable(String locationName){
        if(statement ==null){
            System.out.println("Statement not open | " + LocalDateTime.now());
        } else {
            try {
                getStatement().execute("IF  NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[" + locationName + "30DaysWeatherForecast"+ "]') AND type in (N'U')) CREATE TABLE " + locationName + "30DaysWeatherForecast" + "(_id INTEGER IDENTITY, " +
                        "dt BIGINT, monthDayDt VARCHAR(20), sunrise BIGINT ,hourMinSr VARCHAR(20) , sunset BIGINT, hourMinSs VARCHAR(20) ," +
                        "temp_min FLOAT, temp_max FLOAT, temp_eve FLOAT, temp_night FLOAT, temp_day FLOAT, temp_morn FLOAT," +
                        "feels_like_eve FLOAT, feels_like_night FLOAT, feels_like_day FLOAT, feels_like_morn FLOAT, " +
                        "pressure INTEGER, clouds INTEGER, humidity INTEGER," +
                        "wind_deg INTEGER, wind_deg_text VARCHAR(20), wind_speed FLOAT, " +
                        "rain FLOAT, snow FLOAT, " +
                        "weather_icon VARCHAR(20), weather_description VARCHAR(20), weather_main VARCHAR(20), weather_id INTEGER)");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void createDnHForecastTable(String locationName){
        createDailyForecastTable(locationName+"DailyWeatherForecast");
        createHourlyForecastTable(locationName+"HourlyWeatherForecast");
    }
    public void OneDayReload(String locationName){
        try {
            getStatement().execute("DELETE FROM " + locationName + "DailyWeatherForecast");
            getStatement().execute("DELETE FROM " + locationName + "HourlyWeatherForecast");
            getStatement().execute("DELETE FROM " + locationName + "30DaysWeatherForecast");
            System.out.println("Location : " + locationName + " reloaded | " + LocalDateTime.now());
        } catch (SQLException ignored){
        }
    }

    public void TenMinReload(String locationName){
        try {
            getStatement().execute("DELETE FROM " + locationName + "CurrentlyWeather");
            System.out.println("Location : " + locationName + " reloaded | " + LocalDateTime.now());
        } catch (SQLException ignored){
        }
    }
}