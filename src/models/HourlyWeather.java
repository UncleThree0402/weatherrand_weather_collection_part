package models;

public class HourlyWeather {
    Object datetime;

    Object temp;
    Object feelLike;

    Object uvi;
    Object pressure;
    Object clouds;
    Object rainPercentage;
    Object humidity;
    Object visibility;
    Object dewPoint;

    Object windSpeed;
    Object windGust;
    Object windDeg;
    Object windDegText;

    Object weatherIconUrl;
    Object weatherDescription;
    Object weatherMain;
    Object weatherId;

    public HourlyWeather(Object datetime, Object temp, Object feelLike, Object uvi, Object pressure, Object clouds, Object rainPercentage, Object humidity, Object visibility, Object dewPoint, Object windSpeed, Object windGust, Object windDeg, Object windDegText, Object weatherIconUrl, Object weatherDescription, Object weatherMain, Object weatherId) {
        this.datetime = datetime;
        this.temp = temp;
        this.feelLike = feelLike;
        this.uvi = uvi;
        this.pressure = pressure;
        this.clouds = clouds;
        this.rainPercentage = rainPercentage;
        this.humidity = humidity;
        this.visibility = visibility;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windDeg = windDeg;
        this.windDegText = windDegText;
        this.weatherIconUrl = weatherIconUrl;
        this.weatherDescription = weatherDescription;
        this.weatherMain = weatherMain;
        this.weatherId = weatherId;
    }

    public HourlyWeather() {
    }

    public Object getDatetime() {
        return datetime;
    }

    public void setDatetime(Object datetime) {
        this.datetime = datetime;
    }

    public Object getTemp() {
        return temp;
    }

    public void setTemp(Object temp) {
        this.temp = temp;
    }

    public Object getFeelLike() {
        return feelLike;
    }

    public void setFeelLike(Object feelLike) {
        this.feelLike = feelLike;
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

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
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
