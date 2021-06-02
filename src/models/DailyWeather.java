package models;

public class DailyWeather {
    Object datetime;
    Object sunriseTime;
    Object sunsetTime;
    Object moonriseTime;
    Object moonSetTime;

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

    Object moon_phase;
    Object uvi;
    Object pressure;
    Object clouds;
    Object rainPercentage;
    Object humidity;
    Object dewPoint;

    Object windSpeed;
    Object windGust;
    Object windDeg;
    Object windDegText;

    Object weatherIcon;
    Object weatherDescription;
    Object weatherMain;
    Object weatherId;

    public DailyWeather(Object datetime, Object sunriseTime, Object sunsetTime, Object moonriseTime, Object moonSetTime, Object temperatureMax, Object temperatureMin, Object temperatureMorn, Object temperatureDay, Object temperatureEve, Object temperatureNight, Object feelLikeMorn, Object feelLikeDay, Object feelLikeEve, Object feelLikeNight, Object moon_phase, Object uvi, Object pressure, Object clouds, Object rainPercentage, Object humidity, Object dewPoint, Object windSpeed, Object windGust, Object windDeg, Object windDegText, Object weatherIcon, Object weatherDescription, Object weatherMain, Object weatherId) {
        this.datetime = datetime;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.moonriseTime = moonriseTime;
        this.moonSetTime = moonSetTime;
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
        this.moon_phase = moon_phase;
        this.uvi = uvi;
        this.pressure = pressure;
        this.clouds = clouds;
        this.rainPercentage = rainPercentage;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windDeg = windDeg;
        this.windDegText = windDegText;
        this.weatherIcon = weatherIcon;
        this.weatherDescription = weatherDescription;
        this.weatherMain = weatherMain;
        this.weatherId = weatherId;
    }

    public DailyWeather() {
    }

    public Object getDatetime() {
        return datetime;
    }

    public void setDatetime(Object datetime) {
        this.datetime = datetime;
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

    public Object getMoonriseTime() {
        return moonriseTime;
    }

    public void setMoonriseTime(Object moonriseTime) {
        this.moonriseTime = moonriseTime;
    }

    public Object getMoonSetTime() {
        return moonSetTime;
    }

    public void setMoonSetTime(Object moonSetTime) {
        this.moonSetTime = moonSetTime;
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

    public Object getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(Object moon_phase) {
        this.moon_phase = moon_phase;
    }

    public Object getUvi() {
        return uvi;
    }

    public void setUvi(Object uvi) {
        this.uvi = uvi;
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

    public Object getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(Object rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public Object getHumidity() {
        return humidity;
    }

    public void setHumidity(Object humidity) {
        this.humidity = humidity;
    }

    public Object getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Object dewPoint) {
        this.dewPoint = dewPoint;
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
