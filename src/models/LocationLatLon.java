package models;

import java.util.ArrayList;

public class LocationLatLon {
    
    private static final String[]lienChiangLatLon = {"26.160231950896055", "119.9517974931635"};
    private static final String[]kinMenLatLon = {"24.44871542964905", "118.3762715738623"};
    private static final String[]penGhuLatLon = {"23.571857412185153", "119.57875964681055"};
    private static final String[]taipeiCityLatLon = {"25.029309140532945", "121.56041859165886"};
    private static final String[]newTaipeiCityLatLon = {"25.016865237024923", "121.46257161575132"};
    private static final String[]taoYuanCityLatLon = {"24.99197364637231", "121.29949332257209"};
    private static final String[]hsinChuCityLatLon = {"24.813540467830727", "120.96715689399412"};
    private static final String[]hsinChuCountyLatLon = {"24.736232985617434", "121.08903646701154"};
    private static final String[]miaoLiCountyLatLon = {"24.560007763334106", "120.82124473675829"};
    private static final String[]taichungCityLatLon = {"24.147148358365737", "120.67430260138588"};
    private static final String[]changHuaCountyLatLon = {"24.0805195809828", "120.53826095139905"};
    private static final String[]yunLinCountyLatLon = {"23.707216034093584", "120.5409217023412"};
    private static final String[]chiaYiCityLatLon = {"23.48037301685801", "120.44075729114368"};
    private static final String[]chiaYiCountyLatLon = {"23.462659014576886", "120.24283173924431"};
    private static final String[]taiNanCityLatLon = {"22.99774867480926", "120.21266225078752"};
    private static final String[]kaoHsiungCityLatLon = {"22.639960018281215", "120.30231239553306"};
    private static final String[]pingTungCountyLatLon = {"22.669108684761337", "120.486032984606"};
    private static final String[]taiTungCountyLatLon = {"22.761068522389053", "121.14356040575235"};
    private static final String[]huaLienCountyLatLon = {"23.994332646768722", "121.60129545299795"};
    private static final String[]yiLanCountyLatLon = {"24.75860413371432", "121.75381659931234"};
    private static final String[]keeLungCityLatLon = {"25.12803785808761", "121.73913954151156"};
    private static final String[]nanTouCountyLatLon = {"23.9650810038001", "120.96752170454546"};
    private static final String[]hengChunLatLon = {"22.0069801766062", "120.74413645132553"};
    
    private static final ArrayList<String[]> locationLatLon = new ArrayList<>();

    public LocationLatLon() {
        insertLatLon();
    }

    public  ArrayList<String[]> getLocationLatLon() {
        return locationLatLon;
    }

    public void insertLatLon(){
        locationLatLon.add(lienChiangLatLon);
        locationLatLon.add(kinMenLatLon);
        locationLatLon.add(penGhuLatLon);
        locationLatLon.add(taipeiCityLatLon);
        locationLatLon.add(newTaipeiCityLatLon);
        locationLatLon.add(taoYuanCityLatLon);
        locationLatLon.add(hsinChuCityLatLon);
        locationLatLon.add(hsinChuCountyLatLon);
        locationLatLon.add(miaoLiCountyLatLon);
        locationLatLon.add(taichungCityLatLon);
        locationLatLon.add(changHuaCountyLatLon);
        locationLatLon.add(yunLinCountyLatLon);
        locationLatLon.add(chiaYiCityLatLon);
        locationLatLon.add(chiaYiCountyLatLon);
        locationLatLon.add(taiNanCityLatLon);
        locationLatLon.add(kaoHsiungCityLatLon);
        locationLatLon.add(pingTungCountyLatLon);
        locationLatLon.add(taiTungCountyLatLon);
        locationLatLon.add(huaLienCountyLatLon);
        locationLatLon.add(yiLanCountyLatLon);
        locationLatLon.add(keeLungCityLatLon);
        locationLatLon.add(nanTouCountyLatLon);
        locationLatLon.add(hengChunLatLon);
    }
}
