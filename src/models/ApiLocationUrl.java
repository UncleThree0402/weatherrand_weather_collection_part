package models;

import java.util.ArrayList;

public class ApiLocationUrl {

    private static final String apiKey = "";
    private static final String cwbApiKey = "";

    private LocationLatLon mLocationLatLon;

    private ArrayList<String> mDailyAndHourlyWeatherUrl = new ArrayList<>();
    private ArrayList<String> mCurrentWeatherUrl = new ArrayList<>();
    private ArrayList<String> m30DaysWeatherUrl = new ArrayList<>();
    private ArrayList<String> mAirPollutionUrl = new ArrayList<>();
    private String mEarthquakeUrl = "https://opendata.cwb.gov.tw/api/v1/rest/datastore/E-A0015-001?Authorization=" + cwbApiKey + "&areaName=";

    public ApiLocationUrl() {
        this.mLocationLatLon = new LocationLatLon();
        insertCurrentWeatherUrl();
        insertAirPollutionUrl();
        insertDailyAndHourlyWeatherUrl();
        insert30DaysWeatherUrl();
    }

    private void insertDailyAndHourlyWeatherUrl() {
        for (int i = 0; i < mLocationLatLon.getLocationLatLon().size(); i++) {
            mDailyAndHourlyWeatherUrl.add("https://api.openweathermap.org/data/2.5/onecall?lat=" + mLocationLatLon.getLocationLatLon().get(i)[0] + "&lon=" + mLocationLatLon.getLocationLatLon().get(i)[1] + "&exclude=minutely,current&units=metric&appid=" + apiKey);
        }
    }

    private void insertCurrentWeatherUrl() {
        for (int i = 0; i < mLocationLatLon.getLocationLatLon().size(); i++) {
            mCurrentWeatherUrl.add("https://api.openweathermap.org/data/2.5/weather?lat=" + mLocationLatLon.getLocationLatLon().get(i)[0] + "&lon=" + mLocationLatLon.getLocationLatLon().get(i)[1] + "&units=metric&appid=" + apiKey);
        }
    }

    private void insert30DaysWeatherUrl() {
        for (int i = 0; i < mLocationLatLon.getLocationLatLon().size(); i++) {
            m30DaysWeatherUrl.add("https://pro.openweathermap.org/data/2.5/forecast/climate?lat=" + mLocationLatLon.getLocationLatLon().get(i)[0] + "&lon=" + mLocationLatLon.getLocationLatLon().get(i)[1] + "&units=metric&appid=" + apiKey);
        }
    }

    private void insertAirPollutionUrl() {
        for (int i = 0; i < mLocationLatLon.getLocationLatLon().size(); i++) {
            mAirPollutionUrl.add("http://api.openweathermap.org/data/2.5/air_pollution?lat=" + mLocationLatLon.getLocationLatLon().get(i)[0] + "&lon=" + mLocationLatLon.getLocationLatLon().get(i)[1] + "&appid=" + apiKey);
        }
    }

    public ArrayList<String> getDailyAndHourlyWeatherUrl() {
        return mDailyAndHourlyWeatherUrl;
    }

    public ArrayList<String> getCurrentWeatherUrl() {
        return mCurrentWeatherUrl;
    }

    public ArrayList<String> get30DaysWeatherUrl() {
        return m30DaysWeatherUrl;
    }

    public ArrayList<String> getAirPollutionUrl() {
        return mAirPollutionUrl;
    }

    public String getEarthquakeUrl() {
        return mEarthquakeUrl;
    }
}
