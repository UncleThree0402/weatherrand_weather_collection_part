package database;

import models.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@SuppressWarnings({"SqlResolve", "DuplicatedCode"})
public class WeatherDataRepository {

    private WeatherDatabase mWeatherDatabase;
    private ApiRepository mApiRepository;
    private ApiLocationUrl mApiLocationUrl;

    private ArrayList<JSONArray> mCurrentWeather = new ArrayList<>();
    private ArrayList<JSONArray> mAirPollution = new ArrayList<>();
    private ArrayList<JSONArray> mHourlyAndDailyWeather = new ArrayList<>();
    private ArrayList<JSONArray> m30DaysWeather = new ArrayList<>();
    private JSONArray earthquake;


    public WeatherDataRepository(String ipAddress, String databaseName, String username, String password) {
        this.mWeatherDatabase = new WeatherDatabase(ipAddress,databaseName,username,password);
        mApiLocationUrl = new ApiLocationUrl();
        mApiRepository = new ApiRepository();
    }

    public void updateTenMin(){
        reloadTenMinData();
        updateCurrentJSONArray();
        updateAirPollutionJSONArray();
        for (int i = 0; i < mWeatherDatabase.getLocationName().length; i++) {
            insertCurrentWeather(mWeatherDatabase.getLocationName()[i],mCurrentWeather.get(i));
            insertCurrentAirPollution(mWeatherDatabase.getLocationName()[i],mAirPollution.get(i));
        }
    }

    public void updateFiveMin(){
        reloadEarthquakeData();
        updateEarthquakeJSONArray();
        insertEarthquakeData(earthquake);
    }

    public void updateOneDay(){
        reloadOneDayData();
        updateHourlyAndDailyJSONArray();
        update30DaysJSONArray();
        for (int i = 0; i < mWeatherDatabase.getLocationName().length; i++) {
            insertDailyWeather(mWeatherDatabase.getLocationName()[i],mHourlyAndDailyWeather.get(i));
            insertHourlyWeather(mWeatherDatabase.getLocationName()[i],mHourlyAndDailyWeather.get(i));
            insert30daysWeather(mWeatherDatabase.getLocationName()[i],m30DaysWeather.get(i));

        }
    }

    public void insertDailyWeather(String tableName, JSONArray jsonArray) {
        DailyWeather mDailyWeather = new DailyWeather();

        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray daily = (JSONArray) forecastData.get("daily");
        try {
            for (int i = 0; i < daily.toArray().length; i++) {
                JSONObject dailyData = (JSONObject) daily.get(i);
                JSONObject temp = (JSONObject) dailyData.get("temp");
                JSONObject feelsLike = (JSONObject) dailyData.get("feels_like");
                JSONArray wt = (JSONArray) dailyData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);

                mDailyWeather.setMoonSetTime(dailyData.get("moonset"));
                mDailyWeather.setSunriseTime(dailyData.get("sunrise"));
                mDailyWeather.setTemperatureMin(temp.get("min"));
                mDailyWeather.setTemperatureMax(temp.get("max"));
                mDailyWeather.setTemperatureEve(temp.get("eve"));
                mDailyWeather.setTemperatureNight(temp.get("night"));
                mDailyWeather.setTemperatureDay(temp.get("day"));
                mDailyWeather.setTemperatureMorn(temp.get("morn"));
                mDailyWeather.setMoon_phase(dailyData.get("moon_phase"));
                mDailyWeather.setUvi(dailyData.get("uvi"));
                mDailyWeather.setMoonriseTime(dailyData.get("moonrise"));
                mDailyWeather.setPressure(dailyData.get("pressure"));
                mDailyWeather.setClouds(dailyData.get("clouds"));
                mDailyWeather.setFeelLikeEve(feelsLike.get("eve"));
                mDailyWeather.setFeelLikeNight(feelsLike.get("night"));
                mDailyWeather.setFeelLikeDay(feelsLike.get("day"));
                mDailyWeather.setFeelLikeMorn(feelsLike.get("morn"));
                mDailyWeather.setDatetime(dailyData.get("dt"));
                mDailyWeather.setRainPercentage(dailyData.get("pop"));
                mDailyWeather.setWindDeg(dailyData.get("wind_deg"));
                mDailyWeather.setWindDegText(windDegreeString((long) dailyData.get("wind_deg")));
                mDailyWeather.setWindGust(dailyData.get("wind_gust"));
                mDailyWeather.setDewPoint(dailyData.get("dew_point"));
                mDailyWeather.setSunsetTime(dailyData.get("sunset"));
                mDailyWeather.setWeatherIcon("http://openweathermap.org/img/wn/" + weather.get("icon") + "@2x.png");
                mDailyWeather.setWeatherDescription(weather.get("description"));
                mDailyWeather.setWeatherMain(weather.get("main"));
                mDailyWeather.setWeatherId(weather.get("id"));
                mDailyWeather.setHumidity(dailyData.get("humidity"));
                mDailyWeather.setWindSpeed(dailyData.get("wind_speed"));

                mWeatherDatabase.getStatement().execute("INSERT INTO " + tableName + "DailyWeatherForecast" + " (dt, sunrise , sunset, moonrise, moonset, moon_phase, " +
                        "temp_min, temp_max, temp_eve, temp_night, temp_day, temp_morn, " +
                        "feels_like_eve, feels_like_night, feels_like_day, feels_like_morn, " +
                        "uvi,pressure, clouds, pop, humidity, dew_point, " +
                        "wind_deg, wind_deg_text, wind_gust, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id ) " +
                        "VALUES ( " + mDailyWeather.getDatetime() + ", " + mDailyWeather.getSunriseTime() + ", " + mDailyWeather.getSunsetTime() + ", " + mDailyWeather.getMoonriseTime() + ", " + mDailyWeather.getMoonSetTime() + ", " + mDailyWeather.getMoon_phase() + "," +
                        mDailyWeather.getTemperatureMin() + "," + mDailyWeather.getTemperatureMax() + "," + mDailyWeather.getTemperatureEve() + "," + mDailyWeather.getTemperatureNight() + "," + mDailyWeather.getTemperatureDay() + "," + mDailyWeather.getTemperatureMorn() + "," +
                        mDailyWeather.getFeelLikeEve() + "," + mDailyWeather.getFeelLikeNight() + "," + mDailyWeather.getFeelLikeDay() + "," + mDailyWeather.getFeelLikeMorn() + "," +
                        mDailyWeather.getUvi() + "," + mDailyWeather.getPressure() + "," + mDailyWeather.getClouds() + "," + mDailyWeather.getRainPercentage() + "," + mDailyWeather.getHumidity() + "," + mDailyWeather.getDewPoint() + "," +
                        mDailyWeather.getWindDeg() + ", '" + mDailyWeather.getWindDegText()  + "', " + mDailyWeather.getWindGust()  + "," + mDailyWeather.getWindSpeed()  + ",'" +
                        mDailyWeather.getWeatherIcon()  + "','" + mDailyWeather.getWeatherDescription() + "','" + mDailyWeather.getWeatherMain() + "'," + mDailyWeather.getWeatherId() + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + tableName + " | " + LocalDateTime.now());
        }
    }

    public void insert30daysWeather(String locationName, JSONArray jsonArray) {
        MonthlyWeather mMonthlyWeather = new MonthlyWeather();

        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray list = (JSONArray) forecastData.get("list");
        try {
            for (int i = 0; i < list.toArray().length; i++) {
                JSONObject listData = (JSONObject) list.get(i);
                JSONObject temp = (JSONObject) listData.get("temp");
                JSONObject feelsLike = (JSONObject) listData.get("feels_like");
                JSONArray wt = (JSONArray) listData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);

                mMonthlyWeather.setSunriseTime(listData.get("sunrise"));
                mMonthlyWeather.setTemperatureMin(temp.get("min"));
                mMonthlyWeather.setTemperatureMax(temp.get("max"));
                mMonthlyWeather.setTemperatureEve(temp.get("eve"));
                mMonthlyWeather.setTemperatureNight(temp.get("night"));
                mMonthlyWeather.setTemperatureDay(temp.get("day"));
                mMonthlyWeather.setTemperatureMorn(temp.get("morn"));
                mMonthlyWeather.setPressure(listData.get("pressure"));
                mMonthlyWeather.setClouds(listData.get("clouds"));
                mMonthlyWeather.setFeelLikeEve(feelsLike.get("eve"));
                mMonthlyWeather.setFeelLikeNight(feelsLike.get("night"));
                mMonthlyWeather.setFeelLikeDay(feelsLike.get("day"));
                mMonthlyWeather.setFeelLikeMorn(feelsLike.get("morn"));
                mMonthlyWeather.setDateTime(listData.get("dt"));
                mMonthlyWeather.setWindDeg(listData.get("deg"));
                mMonthlyWeather.setWindDegText(windDegreeString((long) listData.get("deg")));
                mMonthlyWeather.setSunsetTime(listData.get("sunset"));
                mMonthlyWeather.setWeatherIcon("http://openweathermap.org/img/wn/" + weather.get("icon") + "@2x.png");
                mMonthlyWeather.setWeatherDescription(weather.get("description"));
                mMonthlyWeather.setWeatherMain(weather.get("main"));
                mMonthlyWeather.setWeatherId(weather.get("id"));
                mMonthlyWeather.setHumidity(listData.get("humidity"));
                mMonthlyWeather.setWindSpeed(listData.get("speed"));
                mMonthlyWeather.setRain(listData.get("rain"));
                mMonthlyWeather.setSnow(listData.get("snow"));

                mWeatherDatabase.getStatement().execute("INSERT INTO " + locationName + "30DaysWeatherForecast" + " (dt, sunrise, sunset, " +
                        "temp_min, temp_max, temp_eve, temp_night, temp_day, temp_morn, " +
                        "feels_like_eve, feels_like_night, feels_like_day, feels_like_morn, " +
                        "pressure, clouds, humidity, " +
                        "rain, snow, " +
                        "wind_deg, wind_deg_text, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id ) " +
                        "VALUES ( " + mMonthlyWeather.getDateTime() + ", " + mMonthlyWeather.getSunriseTime() + ", " + mMonthlyWeather.getSunsetTime() + ", " +
                        mMonthlyWeather.getTemperatureMin() + "," + mMonthlyWeather.getTemperatureMax() + "," + mMonthlyWeather.getTemperatureEve() + "," + mMonthlyWeather.getTemperatureNight() + "," + mMonthlyWeather.getTemperatureDay() + "," + mMonthlyWeather.getTemperatureMorn() + "," +
                        mMonthlyWeather.getFeelLikeEve() + "," + mMonthlyWeather.getFeelLikeNight() + "," + mMonthlyWeather.getFeelLikeDay() + "," + mMonthlyWeather.getFeelLikeMorn() + "," +
                        mMonthlyWeather.getPressure() + "," + mMonthlyWeather.getClouds() + "," + mMonthlyWeather.getHumidity() + "," +
                        mMonthlyWeather.getRain() + "," + mMonthlyWeather.getSnow() + "," +
                        mMonthlyWeather.getWindDeg() + ", '" + mMonthlyWeather.getWindDegText() + "', " + mMonthlyWeather.getWindSpeed() + ",'" +
                        mMonthlyWeather.getWeatherIcon() + "','" + mMonthlyWeather.getWeatherDescription() + "','" + mMonthlyWeather.getWeatherMain() + "'," + mMonthlyWeather.getWeatherId() + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "30DaysWeatherForecast" + " | " + LocalDateTime.now());
        }
    }

    public void insertHourlyWeather(String tableName, JSONArray jsonArray) {
        HourlyWeather mHourlyWeather = new HourlyWeather();

        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray hourly = (JSONArray) forecastData.get("hourly");
        try {
            for (int i = 0; i < hourly.toArray().length; i++) {
                JSONObject hourlyData = (JSONObject) hourly.get(i);
                JSONArray wt = (JSONArray) hourlyData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);
                mHourlyWeather.setTemp(hourlyData.get("temp"));
                mHourlyWeather.setVisibility(hourlyData.get("visibility"));
                mHourlyWeather.setUvi(hourlyData.get("uvi"));
                mHourlyWeather.setPressure(hourlyData.get("pressure"));
                mHourlyWeather.setClouds(hourlyData.get("clouds"));
                mHourlyWeather.setFeelLike(hourlyData.get("feels_like"));
                mHourlyWeather.setWindGust(hourlyData.get("wind_gust"));
                mHourlyWeather.setDatetime(hourlyData.get("dt"));
                mHourlyWeather.setRainPercentage(hourlyData.get("pop"));
                mHourlyWeather.setWindDeg(hourlyData.get("wind_deg"));
                mHourlyWeather.setWindDegText(windDegreeString((long) hourlyData.get("wind_deg")));
                mHourlyWeather.setDewPoint(hourlyData.get("dew_point"));
                mHourlyWeather.setHumidity(hourlyData.get("humidity"));
                mHourlyWeather.setWindSpeed(hourlyData.get("wind_speed"));
                mHourlyWeather.setWeatherIconUrl("http://openweathermap.org/img/wn/" + weather.get("icon") + "@2x.png");
                mHourlyWeather.setWeatherDescription(weather.get("description"));
                mHourlyWeather.setWeatherMain(weather.get("main"));
                mHourlyWeather.setWeatherId(weather.get("id"));

                mWeatherDatabase.getStatement().execute("INSERT INTO " + tableName + "HourlyWeatherForecast" + " (dt, " +
                        "temp , feels_like, uvi, pressure, clouds, pop, humidity, visibility, dew_point, " +
                        "wind_deg, wind_deg_text, wind_gust, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id ) " +
                        "VALUES ( " + mHourlyWeather.getDatetime() + ", " +
                        mHourlyWeather.getTemp() + "," + mHourlyWeather.getFeelLike() + "," + mHourlyWeather.getUvi() + "," + mHourlyWeather.getPressure() + "," + mHourlyWeather.getClouds() + "," + mHourlyWeather.getRainPercentage() + "," + mHourlyWeather.getHumidity() + "," + mHourlyWeather.getVisibility() + "," + mHourlyWeather.getDewPoint() + "," +
                        mHourlyWeather.getWindDeg() + ", '" + mHourlyWeather.getWindDegText() + "', " + mHourlyWeather.getWindGust() + "," + mHourlyWeather.getWindSpeed() + ", '" + mHourlyWeather.getWeatherIconUrl() + "', '" + mHourlyWeather.getWeatherDescription() + "', '" + mHourlyWeather.getWeatherMain() + "' ," + mHourlyWeather.getWeatherId() + ")");


            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + tableName + " | " + LocalDateTime.now());
        }
    }

    public void insertCurrentWeather(String locationName, JSONArray jsonArray) {
        CurrentWeather mCurrentWeather = new CurrentWeather();

        JSONObject data = (JSONObject) jsonArray.get(0);
        try {
            JSONArray wt = (JSONArray) data.get("weather");
            JSONObject weather = (JSONObject) wt.get(0);
            JSONObject main = (JSONObject) data.get("main");
            JSONObject wind = (JSONObject) data.get("wind");
            JSONObject cloud = (JSONObject) data.get("clouds");
            JSONObject sys = (JSONObject) data.get("sys");
            JSONObject rain = (JSONObject) data.get("rain");
            JSONObject snow = (JSONObject) data.get("snow");

            mCurrentWeather.setDateTime(data.get("dt"));
            mCurrentWeather.setVisibility(data.get("visibility"));
            mCurrentWeather.setSunriseTime(sys.get("sunrise"));
            mCurrentWeather.setSunsetTime(sys.get("sunset"));
            mCurrentWeather.setTemperature(main.get("temp"));
            mCurrentWeather.setFeelLike(main.get("feels_like"));
            mCurrentWeather.setPressure(main.get("pressure"));
            mCurrentWeather.setHumidity(main.get("humidity"));
            mCurrentWeather.setTemperatureMin(main.get("temp_min"));
            mCurrentWeather.setTemperatureMax(main.get("temp_max"));
            mCurrentWeather.setSeaLevelPressure(main.get("sea_level"));
            mCurrentWeather.setGroundLevelPressure(main.get("grnd_level"));
            if (wind != null) {
                mCurrentWeather.setWindSpeed(wind.get("speed"));
                mCurrentWeather.setWindDeg(wind.get("deg"));
                mCurrentWeather.setWindDegText(windDegreeString((long) wind.get("deg")));
                mCurrentWeather.setWindGust(wind.get("gust"));
            } else {
                mCurrentWeather.setWindSpeed(null);
                mCurrentWeather.setWindDeg(null);
                mCurrentWeather.setWindDegText(null);
                mCurrentWeather.setWindGust(null);
            }
            mCurrentWeather.setClouds(cloud.get("all"));

            if(wind.get("gust") == null){
                mCurrentWeather.setWindGust(0);
            }
            mCurrentWeather.setWeatherIconUrl("http://openweathermap.org/img/wn/" + weather.get("icon") + "@2x.png");
            mCurrentWeather.setWeatherDescription(weather.get("description"));
            mCurrentWeather.setWeatherMain(weather.get("main"));
            mCurrentWeather.setWeatherId(weather.get("id"));


            mWeatherDatabase.getStatement().execute("INSERT INTO " + locationName + "CurrentlyWeather" + " (dt, sunrise, sunset, " +
                    "temp, feels_like, pressure, humidity, temp_min, temp_max, sea_level, grnd_level, visibility, " +
                    "clouds, " +
                    "wind_speed, wind_deg, wind_deg_text ,wind_gust, " +
                    "weather_icon, weather_description, weather_main, weather_id) " +
                    "VALUES ( " + mCurrentWeather.getDateTime() + ", " + mCurrentWeather.getSunriseTime() + ", "  + mCurrentWeather.getSunsetTime() + ", " +
                    mCurrentWeather.getTemperature() + "," + mCurrentWeather.getFeelLike() + "," + mCurrentWeather.getPressure() + "," + mCurrentWeather.getHumidity() + "," + mCurrentWeather.getTemperatureMin() + "," + mCurrentWeather.getTemperatureMax() + "," + mCurrentWeather.getSeaLevelPressure() + "," + mCurrentWeather.getGroundLevelPressure() + "," + mCurrentWeather.getVisibility() + "," +
                    mCurrentWeather.getClouds() + "," +
                    mCurrentWeather.getWindSpeed() + "," + mCurrentWeather.getWindDeg() + ", '" + mCurrentWeather.getWindDegText() + "', " + mCurrentWeather.getWindGust() + ", '" + mCurrentWeather.getWeatherIconUrl() + "', '" + mCurrentWeather.getWeatherDescription() + "', '" + mCurrentWeather.getWeatherMain() + "' ," + mCurrentWeather.getWeatherId() + ")");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "CurrentlyWeather" + " | " + LocalDateTime.now());
        }
    }

    public void insertCurrentAirPollution(String locationName, JSONArray jsonArray) {
        Object aqi, ap_co, ap_no, ap_no2, ap_o3, ap_so2, ap_pm2_5, ap_pm10, ap_nh3;

        JSONObject data = (JSONObject) jsonArray.get(0);
        try {
            JSONArray listArray = (JSONArray) data.get("list");
            JSONObject list = (JSONObject) listArray.get(0);
            JSONObject main = (JSONObject) list.get("main");
            JSONObject components = (JSONObject) list.get("components");
            aqi = main.get("aqi");
            ap_co = components.get("co");
            ap_no = components.get("no");
            ap_no2 = components.get("no2");
            ap_o3 = components.get("o3");
            ap_so2 = components.get("so2");
            ap_pm2_5 = components.get("pm2_5");
            ap_pm10 = components.get("pm10");
            ap_nh3 = components.get("nh3");

            mWeatherDatabase.getStatement().execute("UPDATE " + locationName + "CurrentlyWeather" + " SET " +
                    "aqi = " + aqi + ", ap_co = " + ap_co + " ,ap_no = " + ap_no + " ,ap_no2 = " + ap_no2 +
                    " ,ap_o3 = " + ap_o3 + " ,ap_so2 = " + ap_so2 + " ,ap_pm2_5 = " + ap_pm2_5 + " ,ap_pm10 = " + ap_pm10 + " ,ap_nh3 = " + ap_nh3);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "AirPollutionWeather" + " | " + LocalDateTime.now());
        }
    }

    public void insertEarthquakeData(JSONArray jsonArray){
        EarthquakeData mEarthquakeData = new EarthquakeData();

        JSONObject data = (JSONObject) jsonArray.get(0);

        JSONObject records = (JSONObject) data.get("records");
        JSONArray eq = (JSONArray) records.get("earthquake");
        JSONObject earthquake = (JSONObject) eq.get(0);
        JSONObject earthquakeInfo = (JSONObject) earthquake.get("earthquakeInfo");
        JSONObject depth = (JSONObject) earthquakeInfo.get("depth");
        JSONObject magnitude = (JSONObject) earthquakeInfo.get("magnitude");


        mEarthquakeData.setEarthquakeNo(earthquake.get("earthquakeNo"));
        mEarthquakeData.setReportColour(earthquake.get("reportColor"));
        mEarthquakeData.setReportContent(earthquake.get("reportContent"));
        mEarthquakeData.setOriginTime(earthquakeInfo.get("originTime"));
        mEarthquakeData.setDepth(depth.get("value"));
        mEarthquakeData.setMagnitude(magnitude.get("magnitudeValue"));

        try{
            mWeatherDatabase.getStatement().execute("INSERT INTO earthquake " +
                    "(earthquakeNo, reportColor, reportContent, originTime, depth_value, magnitudeValue)" +
                    "VALUES ( " + mEarthquakeData.getEarthquakeNo()+ ", N'" + mEarthquakeData.getReportColour()+ "', " +
                    "N'" + mEarthquakeData.getReportContent() + "','" + mEarthquakeData.getOriginTime() + "'," +
                    mEarthquakeData.getDepth() + "," + mEarthquakeData.getMagnitude() + ")" );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    private static String windDegreeString(long deg) {
        double check = (double) deg;
        if (check > 348.75 || check < 11.25) {
            return "N";
        } else if (check > 11.25 && check < 33.75) {
            return "NNE";
        } else if (check > 33.75 && check < 56.25) {
            return "NE";
        } else if (check > 56.25 && check < 78.75) {
            return "ENE";
        } else if (check > 78.75 && check < 101.25) {
            return "E";
        } else if (check > 101.25 && check < 123.75) {
            return "ESE";
        } else if (check > 123.75 && check < 146.25) {
            return "SE";
        } else if (check > 146.25 && check < 168.75) {
            return "SSE";
        } else if (check > 168.75 && check < 191.25) {
            return "S";
        } else if (check > 191.25 && check < 213.75) {
            return "SSW";
        } else if (check > 213.75 && check < 236.25) {
            return "SW";
        } else if (check > 236.25 && check < 258.75) {
            return "WSW";
        } else if (check > 258.75 && check < 281.25) {
            return "W";
        } else if (check > 281.25 && check < 303.75) {
            return "WNW";
        } else if (check > 303.75 && check < 326.25) {
            return "NW";
        } else if (check > 326.25 && check < 348.75) {
            return "NNW";
        } else {
            return null;
        }
    }

    private void updateHourlyAndDailyJSONArray(){
        for (int i = 0; i < mApiLocationUrl.getDailyAndHourlyWeatherUrl().size(); i++) {
            if(mHourlyAndDailyWeather.size() < mApiLocationUrl.getDailyAndHourlyWeatherUrl().size()) {
                mHourlyAndDailyWeather.add(mApiRepository.jsonArray(mApiLocationUrl.getDailyAndHourlyWeatherUrl().get(i)));
            }else{
                mHourlyAndDailyWeather.set(i,mApiRepository.jsonArray(mApiLocationUrl.getDailyAndHourlyWeatherUrl().get(i)));
            }
        }
        System.out.println("Day and Hour JSONArray updated | "+ LocalDateTime.now());
    }

    private ArrayList<JSONArray> updateCurrentJSONArray(){
        for (int i = 0; i < mApiLocationUrl.getCurrentWeatherUrl().size(); i++) {
            if(mCurrentWeather.size() < mApiLocationUrl.getCurrentWeatherUrl().size()) {
                mCurrentWeather.add(mApiRepository.jsonArray(mApiLocationUrl.getCurrentWeatherUrl().get(i)));
            }else{
                mCurrentWeather.set(i,mApiRepository.jsonArray(mApiLocationUrl.getCurrentWeatherUrl().get(i)));
            }
        }
        System.out.println("Current JSONArray updated | "+ LocalDateTime.now());
        return mCurrentWeather;
    }

    private void update30DaysJSONArray(){
        for (int i = 0; i < mApiLocationUrl.get30DaysWeatherUrl().size(); i++) {
            if(m30DaysWeather.size() < mApiLocationUrl.get30DaysWeatherUrl().size()) {
                m30DaysWeather.add(mApiRepository.jsonArray(mApiLocationUrl.get30DaysWeatherUrl().get(i)));
            }else{
                m30DaysWeather.set(i,mApiRepository.jsonArray(mApiLocationUrl.get30DaysWeatherUrl().get(i)));
            }
        }
        System.out.println("30Days JSONArray updated | "+ LocalDateTime.now());

    }

    private void updateAirPollutionJSONArray(){
        for (int i = 0; i < mApiLocationUrl.getAirPollutionUrl().size(); i++) {
            if(mAirPollution.size() < mApiLocationUrl.getAirPollutionUrl().size()) {
                mAirPollution.add(mApiRepository.jsonArray(mApiLocationUrl.getAirPollutionUrl().get(i)));
            }else{
                mAirPollution.set(i,mApiRepository.jsonArray(mApiLocationUrl.getAirPollutionUrl().get(i)));
            }
        }
        System.out.println("Air Pollution JSONArray updated | "+ LocalDateTime.now());

    }

    private void updateEarthquakeJSONArray(){
        earthquake = mApiRepository.jsonArray(mApiLocationUrl.getEarthquakeUrl());
    }

    private void reloadEarthquakeData(){
        try {
            mWeatherDatabase.getStatement().execute("DELETE FROM earthquake");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void reloadTenMinData(){
        try {
            for (int i = 0; i < mWeatherDatabase.getLocationName().length; i++) {
                mWeatherDatabase.getStatement().execute("DELETE FROM " + mWeatherDatabase.getLocationName()[i] + "CurrentlyWeather");
                System.out.println("Location : " + mWeatherDatabase.getLocationName()[i] + " reloaded | " + LocalDateTime.now());
            }
        } catch (SQLException ignored){
        }
    }

    private void reloadOneDayData(){
        try {
            for (int i = 0; i < mWeatherDatabase.getLocationName().length; i++) {
                mWeatherDatabase.getStatement().execute("DELETE FROM " + mWeatherDatabase.getLocationName()[i] + "DailyWeatherForecast");
                mWeatherDatabase.getStatement().execute("DELETE FROM " + mWeatherDatabase.getLocationName()[i] + "HourlyWeatherForecast");
                mWeatherDatabase.getStatement().execute("DELETE FROM " + mWeatherDatabase.getLocationName()[i] + "30DaysWeatherForecast");
                System.out.println("Location : " + mWeatherDatabase.getLocationName()[i] + " reloaded | " + LocalDateTime.now());
            }
        } catch (SQLException ignored){
        }
    }
}
