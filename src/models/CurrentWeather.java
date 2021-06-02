package models;

public class CurrentWeather {
    Object dateTime;
    Object sunriseTime;
    Object sunsetTime;

    Object temperature;
    Object feelLike;
    Object temperatureMax;
    Object temperatureMin;

    Object pressure;
    Object seaLevelPressure;
    Object groundLevelPressure;
    Object humidity;
    Object visibility;
    Object clouds;

    Object windSpeed;
    Object windGust;
    Object windDeg;
    Object windDegText;

    Object aqi;
    Object co;
    Object no;
    Object no2;
    Object o3;
    Object so2;
    Object pm25;
    Object pm10;
    Object nh3;

    Object weatherIconUrl;
    Object weatherDescription;
    Object weatherMain;
    Object weatherId;

    public CurrentWeather(Object dateTime, Object sunriseTime, Object sunsetTime, Object temperature, Object feelLike, Object temperatureMax, Object temperatureMin, Object pressure, Object seaLevelPressure, Object groundLevelPressure, Object humidity, Object visibility, Object clouds, Object windSpeed, Object windGust, Object windDeg, Object windDegText, Object aqi, Object co, Object no, Object no2, Object o3, Object so2, Object pm25, Object pm10, Object nh3, Object weatherIconUrl, Object weatherDescription, Object weatherMain, Object weatherId) {
        this.dateTime = dateTime;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.temperature = temperature;
        this.feelLike = feelLike;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.pressure = pressure;
        this.seaLevelPressure = seaLevelPressure;
        this.groundLevelPressure = groundLevelPressure;
        this.humidity = humidity;
        this.visibility = visibility;
        this.clouds = clouds;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windDeg = windDeg;
        this.windDegText = windDegText;
        this.aqi = aqi;
        this.co = co;
        this.no = no;
        this.no2 = no2;
        this.o3 = o3;
        this.so2 = so2;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.nh3 = nh3;
        this.weatherIconUrl = weatherIconUrl;
        this.weatherDescription = weatherDescription;
        this.weatherMain = weatherMain;
        this.weatherId = weatherId;
    }

    public CurrentWeather() {
    }

    public Object getDateTime() {
        return dateTime;
    }

    public void setDateTime(Object dateTime) {
        this.dateTime = dateTime;
    }

    public Object getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(Object sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public Object getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(Object sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public Object getTemperature() {
        return temperature;
    }

    public void setTemperature(Object temperature) {
        this.temperature = temperature;
    }

    public Object getFeelLike() {
        return feelLike;
    }

    public void setFeelLike(Object feelLike) {
        this.feelLike = feelLike;
    }

    public Object getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(Object temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Object getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(Object temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public Object getPressure() {
        return pressure;
    }

    public void setPressure(Object pressure) {
        this.pressure = pressure;
    }

    public Object getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(Object seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    public Object getGroundLevelPressure() {
        return groundLevelPressure;
    }

    public void setGroundLevelPressure(Object groundLevelPressure) {
        this.groundLevelPressure = groundLevelPressure;
    }

    public Object getHumidity() {
        return humidity;
    }

    public void setHumidity(Object humidity) {
        this.humidity = humidity;
    }

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public Object getClouds() {
        return clouds;
    }

    public void setClouds(Object clouds) {
        this.clouds = clouds;
    }

    public Object getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Object windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Object getWindGust() {
        return windGust;
    }

    public void setWindGust(Object windGust) {
        this.windGust = windGust;
    }

    public Object getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(Object windDeg) {
        this.windDeg = windDeg;
    }

    public Object getWindDegText() {
        return windDegText;
    }

    public void setWindDegText(Object windDegText) {
        this.windDegText = windDegText;
    }

    public Object getAqi() {
        return aqi;
    }

    public void setAqi(Object aqi) {
        this.aqi = aqi;
    }

    public Object getCo() {
        return co;
    }

    public void setCo(Object co) {
        this.co = co;
    }

    public Object getNo() {
        return no;
    }

    public void setNo(Object no) {
        this.no = no;
    }

    public Object getNo2() {
        return no2;
    }

    public void setNo2(Object no2) {
        this.no2 = no2;
    }

    public Object getO3() {
        return o3;
    }

    public void setO3(Object o3) {
        this.o3 = o3;
    }

    public Object getSo2() {
        return so2;
    }

    public void setSo2(Object so2) {
        this.so2 = so2;
    }

    public Object getPm25() {
        return pm25;
    }

    public void setPm25(Object pm25) {
        this.pm25 = pm25;
    }

    public Object getPm10() {
        return pm10;
    }

    public void setPm10(Object pm10) {
        this.pm10 = pm10;
    }

    public Object getNh3() {
        return nh3;
    }

    public void setNh3(Object nh3) {
        this.nh3 = nh3;
    }

    public Object getWeatherIconUrl() {
        return weatherIconUrl;
    }

    public void setWeatherIconUrl(Object weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    public Object getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(Object weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Object getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(Object weatherMain) {
        this.weatherMain = weatherMain;
    }

    public Object getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Object weatherId) {
        this.weatherId = weatherId;
    }
}
