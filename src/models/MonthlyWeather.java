package models;

public class MonthlyWeather {

    Object dateTime;
    Object sunriseTime;
    Object sunsetTime;

    Object temperatureMax;
    Object temperatureMin;
    Object temperatureMorn;
    Object temperatureDay;
    Object temperatureEve;
    Object temperatureNight;

    Object feelLikeMorn;
    Object feelLikeDay;
    Object feelLikeEve;
    Object feelLikeNight;

    Object pressure;
    Object clouds;
    Object humidity;
    Object rain;
    Object snow;

    Object windSpeed;
    Object windDeg;
    Object windDegText;

    Object weatherIcon;
    Object weatherDescription;
    Object weatherMain;
    Object weatherId;

    public MonthlyWeather(Object dateTime, Object sunriseTime, Object sunsetTime, Object temperatureMax, Object temperatureMin, Object temperatureMorn, Object temperatureDay, Object temperatureEve, Object temperatureNight, Object feelLikeMorn, Object feelLikeDay, Object feelLikeEve, Object feelLikeNight, Object pressure, Object clouds, Object humidity, Object windSpeed, Object windDeg, Object windDegText, Object rain, Object snow, Object weatherIcon, Object weatherDescription, Object weatherMain, Object weatherId) {
        this.dateTime = dateTime;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.temperatureMorn = temperatureMorn;
        this.temperatureDay = temperatureDay;
        this.temperatureEve = temperatureEve;
        this.temperatureNight = temperatureNight;
        this.feelLikeMorn = feelLikeMorn;
        this.feelLikeDay = feelLikeDay;
        this.feelLikeEve = feelLikeEve;
        this.feelLikeNight = feelLikeNight;
        this.pressure = pressure;
        this.clouds = clouds;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windDegText = windDegText;
        this.rain = rain;
        this.snow = snow;
        this.weatherIcon = weatherIcon;
        this.weatherDescription = weatherDescription;
        this.weatherMain = weatherMain;
        this.weatherId = weatherId;
    }

    public MonthlyWeather() {
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

    public Object getTemperatureMorn() {
        return temperatureMorn;
    }

    public void setTemperatureMorn(Object temperatureMorn) {
        this.temperatureMorn = temperatureMorn;
    }

    public Object getTemperatureDay() {
        return temperatureDay;
    }

    public void setTemperatureDay(Object temperatureDay) {
        this.temperatureDay = temperatureDay;
    }

    public Object getTemperatureEve() {
        return temperatureEve;
    }

    public void setTemperatureEve(Object temperatureEve) {
        this.temperatureEve = temperatureEve;
    }

    public Object getTemperatureNight() {
        return temperatureNight;
    }

    public void setTemperatureNight(Object temperatureNight) {
        this.temperatureNight = temperatureNight;
    }

    public Object getFeelLikeMorn() {
        return feelLikeMorn;
    }

    public void setFeelLikeMorn(Object feelLikeMorn) {
        this.feelLikeMorn = feelLikeMorn;
    }

    public Object getFeelLikeDay() {
        return feelLikeDay;
    }

    public void setFeelLikeDay(Object feelLikeDay) {
        this.feelLikeDay = feelLikeDay;
    }

    public Object getFeelLikeEve() {
        return feelLikeEve;
    }

    public void setFeelLikeEve(Object feelLikeEve) {
        this.feelLikeEve = feelLikeEve;
    }

    public Object getFeelLikeNight() {
        return feelLikeNight;
    }

    public void setFeelLikeNight(Object feelLikeNight) {
        this.feelLikeNight = feelLikeNight;
    }

    public Object getPressure() {
        return pressure;
    }

    public void setPressure(Object pressure) {
        this.pressure = pressure;
    }

    public Object getClouds() {
        return clouds;
    }

    public void setClouds(Object clouds) {
        this.clouds = clouds;
    }

    public Object getHumidity() {
        return humidity;
    }

    public void setHumidity(Object humidity) {
        this.humidity = humidity;
    }

    public Object getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Object windSpeed) {
        this.windSpeed = windSpeed;
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

    public Object getRain() {
        return rain;
    }

    public void setRain(Object rain) {
        this.rain = rain;
    }

    public Object getSnow() {
        return snow;
    }

    public void setSnow(Object snow) {
        this.snow = snow;
    }

    public Object getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(Object weatherIcon) {
        this.weatherIcon = weatherIcon;
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
