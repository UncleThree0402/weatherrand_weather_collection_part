package model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class InsertTable {

    public void dailyWeatherForecast(Datasource datasource, String tableName, JSONArray jsonArray) {
        Object dt, sunrise, sunset, moonrise, moonSet, moonPhase;
        Object tempMin, tempMax, tempEve, tempNight, tempDay, tempMorn;
        Object feelsLikeEve, feelsLikeNight, feelsLikeDay, feelsLikeMorn;
        Object uvi, pressure, clouds, pop, humidity, dewPoint;
        Object windDeg, windGust, windSpeed;
        Object wind_deg_text, monthDayDt, hourMinSr, hourMinSs, hourMinMr, hourMinMs;
        Object weatherIcon, weatherDe, weatherMain, weatherId;


        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray daily = (JSONArray) forecastData.get("daily");
        try {
            for (int i = 0; i < daily.toArray().length; i++) {
                JSONObject dailyData = (JSONObject) daily.get(i);
                JSONObject temp = (JSONObject) dailyData.get("temp");
                JSONObject feelsLike = (JSONObject) dailyData.get("feels_like");
                JSONArray wt = (JSONArray) dailyData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);

                moonSet = dailyData.get("moonset");
                hourMinMs = TimeProcessing.timeString((long) dailyData.get("moonset"), "HH:mm");
                sunrise = dailyData.get("sunrise");
                hourMinSr = TimeProcessing.timeString((long) dailyData.get("sunrise"), "HH:mm");
                tempMin = temp.get("min");
                tempMax = temp.get("max");
                tempEve = temp.get("eve");
                tempNight = temp.get("night");
                tempDay = temp.get("day");
                tempMorn = temp.get("morn");
                moonPhase = dailyData.get("moon_phase");
                uvi = dailyData.get("uvi");
                moonrise = dailyData.get("moonrise");
                hourMinMr = TimeProcessing.timeString((long) dailyData.get("moonrise"), "HH:mm");
                pressure = dailyData.get("pressure");
                clouds = dailyData.get("clouds");
                feelsLikeEve = feelsLike.get("eve");
                feelsLikeNight = feelsLike.get("night");
                feelsLikeDay = feelsLike.get("day");
                feelsLikeMorn = feelsLike.get("morn");
                dt = dailyData.get("dt");
                monthDayDt = TimeProcessing.timeString((long) dailyData.get("dt"), "MM-dd");
                pop = dailyData.get("pop");
                windDeg = dailyData.get("wind_deg");
                wind_deg_text = windDegreeString((long) dailyData.get("wind_deg"));
                windGust = dailyData.get("wind_gust");
                dewPoint = dailyData.get("dew_point");
                sunset = dailyData.get("sunset");
                hourMinSs = TimeProcessing.timeString((long) dailyData.get("sunset"), "HH:mm");
                weatherIcon = weather.get("icon");
                weatherDe = weather.get("description");
                weatherMain = weather.get("main");
                weatherId = weather.get("id");
                humidity = dailyData.get("humidity");
                windSpeed = dailyData.get("wind_speed");

                datasource.getStatement().execute("INSERT INTO " + tableName + " (dt, monthDayDt, sunrise, hourMinSr, sunset, hourMinSs, moonrise, hourMinMr, moonset, hourMinMs, moon_phase, " +
                        "temp_min, temp_max, temp_eve, temp_night, temp_day, temp_morn," +
                        "feels_like_eve, feels_like_night, feels_like_day, feels_like_morn, " +
                        "uvi,pressure, clouds, pop, humidity, dew_point," +
                        "wind_deg, wind_deg_text, wind_gust, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id" + ") " +
                        "VALUES ( " + dt + ", '" + monthDayDt + "', " + sunrise + ", '" + hourMinSr + "', " + sunset + ", '" + hourMinSs + "', " + moonrise + ", '" + hourMinMr + "', " + moonSet + ", '" + hourMinMs + "', " + moonPhase + "," +
                        tempMin + "," + tempMax + "," + tempEve + "," + tempNight + "," + tempDay + "," + tempMorn + "," +
                        feelsLikeEve + "," + feelsLikeNight + "," + feelsLikeDay + "," + feelsLikeMorn + "," +
                        uvi + "," + pressure + "," + clouds + "," + pop + "," + humidity + "," + dewPoint + "," +
                        windDeg + ", '" + wind_deg_text + "', " + windGust + "," + windSpeed + ",'" +
                        weatherIcon + "','" + weatherDe + "','" + weatherMain + "'," + weatherId + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + tableName + " | " + LocalDateTime.now());
        }
    }

    public void days30WeatherForecast(Datasource datasource, String locationName, JSONArray jsonArray) {
        Object dt, sunrise, sunset;
        Object tempMin, tempMax, tempEve, tempNight, tempDay, tempMorn;
        Object feelsLikeEve, feelsLikeNight, feelsLikeDay, feelsLikeMorn;
        Object pressure, clouds, humidity;
        Object windDeg, windSpeed;
        Object wind_deg_text, monthDayDt, hourMinSr, hourMinSs;
        Object rain, snow;
        Object weatherIcon, weatherDe, weatherMain, weatherId;


        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray list = (JSONArray) forecastData.get("list");
        try {
            for (int i = 0; i < list.toArray().length; i++) {
                JSONObject listData = (JSONObject) list.get(i);
                JSONObject temp = (JSONObject) listData.get("temp");
                JSONObject feelsLike = (JSONObject) listData.get("feels_like");
                JSONArray wt = (JSONArray) listData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);

                sunrise = listData.get("sunrise");
                hourMinSr =TimeProcessing.timeString((long) listData.get("sunrise"), "HH:mm");
                tempMin = temp.get("min");
                tempMax = temp.get("max");
                tempEve = temp.get("eve");
                tempNight = temp.get("night");
                tempDay = temp.get("day");
                tempMorn = temp.get("morn");
                pressure = listData.get("pressure");
                clouds = listData.get("clouds");
                feelsLikeEve = feelsLike.get("eve");
                feelsLikeNight = feelsLike.get("night");
                feelsLikeDay = feelsLike.get("day");
                feelsLikeMorn = feelsLike.get("morn");
                dt = listData.get("dt");
                monthDayDt = TimeProcessing.timeString((long) listData.get("dt") , "MM-dd");
                windDeg = listData.get("deg");
                wind_deg_text = windDegreeString((long) listData.get("deg"));
                sunset = listData.get("sunset");
                hourMinSs = TimeProcessing.timeString((long) listData.get("sunset"), "HH:mm");
                weatherIcon = weather.get("icon");
                weatherDe = weather.get("description");
                weatherMain = weather.get("main");
                weatherId = weather.get("id");
                humidity = listData.get("humidity");
                windSpeed = listData.get("speed");
                rain = listData.get("rain");
                snow = listData.get("snow");
                if(rain == null){
                    rain = 0;
                }
                if(snow == null){
                    snow = 0;
                }

                datasource.getStatement().execute("INSERT INTO " + locationName + "30DaysWeatherForecast" + " (dt, monthDayDt, sunrise, hourMinSr, sunset, hourMinSs, " +
                        "temp_min, temp_max, temp_eve, temp_night, temp_day, temp_morn," +
                        "feels_like_eve, feels_like_night, feels_like_day, feels_like_morn, " +
                        "pressure, clouds, humidity," +
                        "rain, snow, " +
                        "wind_deg, wind_deg_text, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id" + ") " +
                        "VALUES ( " + dt + ", '" + monthDayDt + "', " + sunrise + ", '" + hourMinSr + "', " + sunset + ", '" + hourMinSs + "', " +
                        tempMin + "," + tempMax + "," + tempEve + "," + tempNight + "," + tempDay + "," + tempMorn + "," +
                        feelsLikeEve + "," + feelsLikeNight + "," + feelsLikeDay + "," + feelsLikeMorn + "," +
                        pressure + "," + clouds + "," + humidity + "," +
                        rain + "," + snow + "," +
                        windDeg + ", '" + wind_deg_text + "', " + windSpeed + ",'" +
                        weatherIcon + "','" + weatherDe + "','" + weatherMain + "'," + weatherId + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "30DaysWeatherForecast" + " | " + LocalDateTime.now());
        }
    }

    public void hourlyWeatherForecast(Datasource datasource, String tableName, JSONArray jsonArray) {
        Object temp, visibility, uvi, pressure, clouds, feels_like, wind_gust, dt, pop, wind_deg, dew_point, humidity, wind_speed;
        Object weatherIcon, weatherDe, weatherMain, weatherId;
        Object wind_deg_text, hourDt;

        JSONObject forecastData = (JSONObject) jsonArray.get(0);
        JSONArray hourly = (JSONArray) forecastData.get("hourly");
        try {
            for (int i = 0; i < hourly.toArray().length; i++) {
                JSONObject hourlyData = (JSONObject) hourly.get(i);
                JSONArray wt = (JSONArray) hourlyData.get("weather");
                JSONObject weather = (JSONObject) wt.get(0);
                temp = hourlyData.get("temp");
                visibility = hourlyData.get("visibility");
                uvi = hourlyData.get("uvi");
                pressure = hourlyData.get("pressure");
                clouds = hourlyData.get("clouds");
                feels_like = hourlyData.get("feels_like");
                wind_gust = hourlyData.get("wind_gust");
                dt = hourlyData.get("dt");
                hourDt = TimeProcessing.timeString((long) hourlyData.get("dt"), "HH");
                pop = hourlyData.get("pop");
                wind_deg = hourlyData.get("wind_deg");
                wind_deg_text = windDegreeString((long) hourlyData.get("wind_deg"));
                dew_point = hourlyData.get("dew_point");
                humidity = hourlyData.get("humidity");
                wind_speed = hourlyData.get("wind_speed");
                weatherIcon = weather.get("icon");
                weatherDe = weather.get("description");
                weatherMain = weather.get("main");
                weatherId = weather.get("id");

                datasource.getStatement().execute("INSERT INTO " + tableName + " (dt, hourDt, " +
                        "temp , feels_like, uvi, pressure, clouds, pop, humidity, visibility, dew_point," +
                        "wind_deg, wind_deg_text, wind_gust, wind_speed, " +
                        "weather_icon, weather_description, weather_main, weather_id" + ") " +
                        "VALUES ( " + dt + ", '" + hourDt + "', " +
                        temp + "," + feels_like + "," + uvi + "," + pressure + "," + clouds + "," + pop + "," + humidity + "," + visibility + "," + dew_point + "," +
                        wind_deg + ", '" + wind_deg_text + "', " + wind_gust + "," + wind_speed + ", '" + weatherIcon + "', '" + weatherDe + "', '" + weatherMain + "' ," + weatherId + ")");


            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + tableName + " | " + LocalDateTime.now());
        }
    }

    public void currentlyWeather(Datasource datasource, String locationName, JSONArray jsonArray) {
        Object dt, sunrise, sunset;
        Object temp, feels_like, pressure, humidity, temp_min, temp_max, sea_level, grnd_level, visibility;
        Object wind_speed, wind_deg, wind_gust;
        Object wind_deg_text, hourMinDt, hourMinSr, hourMinSs;
        Object clouds, rain_1h, rain_3h, snow_1h, snow_3h;
        Object weather_icon, weather_description, weather_main, weather_id;
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

            dt = data.get("dt");
            hourMinDt = TimeProcessing.timeString((long) data.get("dt"),"HH:mm");
            visibility = data.get("visibility");
            sunrise = sys.get("sunrise");
            hourMinSr = TimeProcessing.timeString((long) sys.get("sunrise") , "HH:mm");
            sunset = sys.get("sunset");
            hourMinSs = TimeProcessing.timeString((long) sys.get("sunset"), "HH:mm");
            temp = main.get("temp");
            feels_like = main.get("feels_like");
            pressure = main.get("pressure");
            humidity = main.get("humidity");
            temp_min = main.get("temp_min");
            temp_max = main.get("temp_max");
            sea_level = main.get("sea_level");
            grnd_level = main.get("grnd_level");
            if (wind != null) {
                wind_speed = wind.get("speed");
                wind_deg = wind.get("deg");
                wind_deg_text = windDegreeString((long) wind.get("deg"));
                wind_gust = wind.get("gust");
            } else {
                wind_speed = null;
                wind_deg = null;
                wind_deg_text = null;
                wind_gust = null;
            }
            clouds = cloud.get("all");
            if (rain != null) {
                rain_1h = rain.get("rain_1h");
                rain_3h = rain.get("rain_3h");
            } else {
                rain_1h = null;
                rain_3h = null;
            }
            if (snow != null) {
                snow_1h = snow.get("snow_1h");
                snow_3h = snow.get("snow_3h");
            } else {
                snow_1h = null;
                snow_3h = null;
            }

            if(wind_gust == null){
                wind_gust = 0;
            }
            weather_icon = weather.get("icon");
            weather_description = weather.get("description");
            weather_main = weather.get("main");
            weather_id = weather.get("id");


            datasource.getStatement().execute("INSERT INTO " + locationName + "CurrentlyWeather" + " (dt, hourMinDt ,sunrise, hourMinSr, sunset, hourMinSs," +
                    "temp, feels_like, pressure, humidity, temp_min, temp_max, sea_level, grnd_level, visibility," +
                    "clouds, rain_1h, rain_3h, snow_1h, snow_3h," +
                    "wind_speed, wind_deg, wind_deg_text ,wind_gust, " +
                    "weather_icon, weather_description, weather_main, weather_id) " +
                    "VALUES ( " + dt + ", '" + hourMinDt + "', " + sunrise + ", '" + hourMinSr + "', " + sunset + ", '" + hourMinSs + "', " +
                    temp + "," + feels_like + "," + pressure + "," + humidity + "," + temp_min + "," + temp_max + "," + sea_level + "," + grnd_level + "," + visibility + "," +
                    clouds + "," + rain_1h + "," + rain_3h + "," + snow_1h + "," + snow_3h + "," +
                    wind_speed + "," + wind_deg + ", '" + wind_deg_text + "', " + wind_gust + ", '" + weather_icon + "', '" + weather_description + "', '" + weather_main + "' ," + weather_id + ")");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "CurrentlyWeather" + " | " + LocalDateTime.now());
        }
    }

    public void insertCurrentAirPollution(Datasource datasource, String locationName, JSONArray jsonArray) {
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

            datasource.getStatement().execute("UPDATE " + locationName + "CurrentlyWeather" + " SET " +
                    "aqi = " + aqi + ", ap_co = " + ap_co + " ,ap_no = " + ap_no + " ,ap_no2 = " + ap_no2 +
                    " ,ap_o3 = " + ap_o3 + " ,ap_so2 = " + ap_so2 + " ,ap_pm2_5 = " + ap_pm2_5 + " ,ap_pm10 = " + ap_pm10 + " ,ap_nh3 = " + ap_nh3);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail to insert " + locationName + "AirPollutionWeather" + " | " + LocalDateTime.now());
        }
    }

    public void insertDnHWeatherForecast(Datasource datasource, String locationName, JSONArray jsonArray) {
        dailyWeatherForecast(datasource, locationName + "DailyWeatherForecast", jsonArray);
        hourlyWeatherForecast(datasource, locationName + "HourlyWeatherForecast", jsonArray);
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
}
