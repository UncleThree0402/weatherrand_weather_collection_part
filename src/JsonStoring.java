import model.JsonUrlConnect;
import org.json.simple.JSONArray;

import java.time.LocalDateTime;

public class JsonStoring {
    private static JSONArray lienChiang;
    private static JSONArray kinMen;
    private static JSONArray penGhu;
    private static JSONArray taipeiCity;
    private static JSONArray newTaipeiCity;
    private static JSONArray taoYuanCity;
    private static JSONArray hsinChuCity;
    private static JSONArray hsinChuCounty;
    private static JSONArray miaoLiCounty;
    private static JSONArray taichungCity;
    private static JSONArray changHuaCounty;
    private static JSONArray yunLinCounty;
    private static JSONArray chiaYiCounty;
    private static JSONArray chiaYiCity;
    private static JSONArray taiNanCity;
    private static JSONArray kaoHsiungCity;
    private static JSONArray pingTungCounty;
    private static JSONArray taiTungCounty;
    private static JSONArray huaLienCounty;
    private static JSONArray yiLanCounty;
    private static JSONArray keeLungCity;
    private static JSONArray nanTouCounty;
    private static JSONArray hengChun;

    private static JSONArray lienChiangCu;
    private static JSONArray kinMenCu;
    private static JSONArray penGhuCu;
    private static JSONArray taipeiCityCu;
    private static JSONArray newTaipeiCityCu;
    private static JSONArray taoYuanCityCu;
    private static JSONArray hsinChuCityCu;
    private static JSONArray hsinChuCountyCu;
    private static JSONArray miaoLiCountyCu;
    private static JSONArray taichungCityCu;
    private static JSONArray changHuaCountyCu;
    private static JSONArray yunLinCountyCu;
    private static JSONArray chiaYiCountyCu;
    private static JSONArray chiaYiCityCu;
    private static JSONArray taiNanCityCu;
    private static JSONArray kaoHsiungCityCu;
    private static JSONArray pingTungCountyCu;
    private static JSONArray taiTungCountyCu;
    private static JSONArray huaLienCountyCu;
    private static JSONArray yiLanCountyCu;
    private static JSONArray keeLungCityCu;
    private static JSONArray nanTouCountyCu;
    private static JSONArray hengChunCu;

    private static JSONArray lienChiang30D;
    private static JSONArray kinMen30D;
    private static JSONArray penGhu30D;
    private static JSONArray taipeiCity30D;
    private static JSONArray newTaipeiCity30D;
    private static JSONArray taoYuanCity30D;
    private static JSONArray hsinChuCity30D;
    private static JSONArray hsinChuCounty30D;
    private static JSONArray miaoLiCounty30D;
    private static JSONArray taichungCity30D;
    private static JSONArray changHuaCounty30D;
    private static JSONArray yunLinCounty30D;
    private static JSONArray chiaYiCounty30D;
    private static JSONArray chiaYiCity30D;
    private static JSONArray taiNanCity30D;
    private static JSONArray kaoHsiungCity30D;
    private static JSONArray pingTungCounty30D;
    private static JSONArray taiTungCounty30D;
    private static JSONArray huaLienCounty30D;
    private static JSONArray yiLanCounty30D;
    private static JSONArray keeLungCity30D;
    private static JSONArray nanTouCounty30D;
    private static JSONArray hengChun30D;

    private static JSONArray lienChiangAP;
    private static JSONArray kinMenAP;
    private static JSONArray penGhuAP;
    private static JSONArray taipeiCityAP;
    private static JSONArray newTaipeiCityAP;
    private static JSONArray taoYuanCityAP;
    private static JSONArray hsinChuCityAP;
    private static JSONArray hsinChuCountyAP;
    private static JSONArray miaoLiCountyAP;
    private static JSONArray taichungCityAP;
    private static JSONArray changHuaCountyAP;
    private static JSONArray yunLinCountyAP;
    private static JSONArray chiaYiCountyAP;
    private static JSONArray chiaYiCityAP;
    private static JSONArray taiNanCityAP;
    private static JSONArray kaoHsiungCityAP;
    private static JSONArray pingTungCountyAP;
    private static JSONArray taiTungCountyAP;
    private static JSONArray huaLienCountyAP;
    private static JSONArray yiLanCountyAP;
    private static JSONArray keeLungCityAP;
    private static JSONArray nanTouCountyAP;
    private static JSONArray hengChunAP;

    private static final String apiKey = "b3758bb61b3e0875e7e07ad856e779b2";
    public static final String cwbApiKey = "CWB-DCFC9D71-2A73-4F09-A9DB-424AEC14B780";

    public static JSONArray earthquake;

    public static final String[]lienChiangLatLon = {"26.160231950896055", "119.9517974931635"};
    public static final String[]kinMenLatLon = {"24.44871542964905", "118.3762715738623"};
    public static final String[]penGhuLatLon = {"23.571857412185153", "119.57875964681055"};
    public static final String[]taipeiCityLatLon = {"25.029309140532945", "121.56041859165886"};
    public static final String[]newTaipeiCityLatLon = {"25.016865237024923", "121.46257161575132"};
    public static final String[]taoYuanCityLatLon = {"24.99197364637231", "121.29949332257209"};
    public static final String[]hsinChuCityLatLon = {"24.813540467830727", "120.96715689399412"};
    public static final String[]hsinChuCountyLatLon = {"24.736232985617434", "121.08903646701154"};
    public static final String[]miaoLiCountyLatLon = {"24.560007763334106", "120.82124473675829"};
    public static final String[]taichungCityLatLon = {"24.147148358365737", "120.67430260138588"};
    public static final String[]changHuaCountyLatLon = {"24.0805195809828", "120.53826095139905"};
    public static final String[]yunLinCountyLatLon = {"23.707216034093584", "120.5409217023412"};
    public static final String[]chiaYiCityLatLon = {"23.48037301685801", "120.44075729114368"};
    public static final String[]chiaYiCountyLatLon = {"23.462659014576886", "120.24283173924431"};
    public static final String[]taiNanCityLatLon = {"22.99774867480926", "120.21266225078752"};
    public static final String[]kaoHsiungCityLatLon = {"22.639960018281215", "120.30231239553306"};
    public static final String[]pingTungCountyLatLon = {"22.669108684761337", "120.486032984606"};
    public static final String[]taiTungCountyLatLon = {"22.761068522389053", "121.14356040575235"};
    public static final String[]huaLienCountyLatLon = {"23.994332646768722", "121.60129545299795"};
    public static final String[]yiLanCountyLatLon = {"24.75860413371432", "121.75381659931234"};
    public static final String[]keeLungCityLatLon = {"25.12803785808761", "121.73913954151156"};
    public static final String[]nanTouCountyLatLon = {"23.9650810038001", "120.96752170454546"};
    public static final String[]hengChunLatLon = {"22.0069801766062", "120.74413645132553"};

    public static final String LIENCHIANG_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.lienChiangLatLon[0] +"&lon="+ JsonStoring.lienChiangLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String KINMEN_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.kinMenLatLon[0] +"&lon="+JsonStoring.kinMenLatLon[1]+"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String PENGHU_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.penGhuLatLon[0] +"&lon="+ JsonStoring.penGhuLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String TAIPEICITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.taipeiCityLatLon[0] +"&lon="+ JsonStoring.taipeiCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String NEWTAIPEICITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.newTaipeiCityLatLon[0] +"&lon="+ JsonStoring.newTaipeiCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String TAOYUAN_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.taoYuanCityLatLon[0] +"&lon="+ JsonStoring.taoYuanCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String HSINCHUCITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.hsinChuCityLatLon[0] +"&lon="+ JsonStoring.hsinChuCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String HSINCHUCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.hsinChuCountyLatLon[0] +"&lon="+ JsonStoring.hsinChuCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String MIAOLICOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.miaoLiCountyLatLon[0] +"&lon="+ JsonStoring.miaoLiCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String TAICHUNGCITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.taichungCityLatLon[0] +"&lon="+ JsonStoring.taichungCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String CHANGHUACOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.changHuaCountyLatLon[0] +"&lon="+ JsonStoring.changHuaCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String YUNLINCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.yunLinCountyLatLon[0] +"&lon="+ JsonStoring.yunLinCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String CHIAYICITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.chiaYiCityLatLon[0] +"&lon="+ JsonStoring.chiaYiCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String CHIAYICOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.chiaYiCountyLatLon[0] +"&lon="+ JsonStoring.chiaYiCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String TAINANCITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.taiNanCityLatLon[0] +"&lon="+ JsonStoring.taiNanCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String KAOHSIUNGCITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.kaoHsiungCityLatLon[0] +"&lon="+ JsonStoring.kaoHsiungCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String PINGTUNGCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.pingTungCountyLatLon[0] +"&lon="+ JsonStoring.pingTungCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String TAITUNG_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.taiTungCountyLatLon[0] +"&lon="+ JsonStoring.taiTungCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String HUALIENCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.huaLienCountyLatLon[0] +"&lon="+ JsonStoring.huaLienCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String YILANCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.yiLanCountyLatLon[0] +"&lon="+ JsonStoring.yiLanCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String KEELUNGCITY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.keeLungCityLatLon[0] +"&lon="+ JsonStoring.keeLungCityLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String NANTOUCOUNTY_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.nanTouCountyLatLon[0] +"&lon="+ JsonStoring.nanTouCountyLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;
    public static final String HENGCHUN_DNH_URL = "https://api.openweathermap.org/data/2.5/onecall?lat="+ JsonStoring.hengChunLatLon[0] +"&lon="+ JsonStoring.hengChunLatLon[1] +"&exclude=minutely,current&units=metric&appid=" + apiKey;

    public static final String LIENCHIANG_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.lienChiangLatLon[0] +"&lon="+ JsonStoring.lienChiangLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KINMEN_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.kinMenLatLon[0] +"&lon="+ JsonStoring.kinMenLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String PENGHU_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.penGhuLatLon[0] +"&lon="+ JsonStoring.penGhuLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAIPEICITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.taipeiCityLatLon[0] +"&lon="+ JsonStoring.taipeiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String NEWTAIPEICITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.newTaipeiCityLatLon[0] +"&lon="+ JsonStoring.newTaipeiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAOYUAN_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.taoYuanCityLatLon[0] +"&lon="+ JsonStoring.taoYuanCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HSINCHUCITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.hsinChuCityLatLon[0] +"&lon="+ JsonStoring.hsinChuCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HSINCHUCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.hsinChuCountyLatLon[0] +"&lon="+ JsonStoring.hsinChuCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String MIAOLICOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.miaoLiCountyLatLon[0] +"&lon="+ JsonStoring.miaoLiCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAICHUNGCITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.taichungCityLatLon[0] +"&lon="+ JsonStoring.taichungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHANGHUACOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.changHuaCountyLatLon[0] +"&lon="+ JsonStoring.changHuaCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String YUNLINCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.yunLinCountyLatLon[0] +"&lon="+ JsonStoring.yunLinCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHIAYICITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.chiaYiCityLatLon[0] +"&lon="+ JsonStoring.chiaYiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHIAYICOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.chiaYiCountyLatLon[0] +"&lon="+ JsonStoring.chiaYiCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAINANCITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.taiNanCityLatLon[0] +"&lon="+ JsonStoring.taiNanCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KAOHSIUNGCITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.kaoHsiungCityLatLon[0] +"&lon="+ JsonStoring.kaoHsiungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String PINGTUNGCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.pingTungCountyLatLon[0] +"&lon="+ JsonStoring.pingTungCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAITUNG_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.taiTungCountyLatLon[0] +"&lon="+ JsonStoring.taiTungCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HUALIENCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.huaLienCountyLatLon[0] +"&lon="+ JsonStoring.huaLienCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String YILANCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.yiLanCountyLatLon[0] +"&lon="+ JsonStoring.yiLanCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KEELUNGCITY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.keeLungCityLatLon[0] +"&lon="+ JsonStoring.keeLungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String NANTOUCOUNTY_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.nanTouCountyLatLon[0] +"&lon="+ JsonStoring.nanTouCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HENGCHUN_CU_URL = "https://api.openweathermap.org/data/2.5/weather?lat="+ JsonStoring.hengChunLatLon[0] +"&lon="+ JsonStoring.hengChunLatLon[1] +"&units=metric&appid=" + apiKey;

    public static final String LIENCHIANG_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.lienChiangLatLon[0] +"&lon="+ JsonStoring.lienChiangLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KINMEN_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.kinMenLatLon[0] +"&lon="+ JsonStoring.kinMenLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String PENGHU_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.penGhuLatLon[0] +"&lon="+ JsonStoring.penGhuLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAIPEICITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.taipeiCityLatLon[0] +"&lon="+ JsonStoring.taipeiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String NEWTAIPEICITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.newTaipeiCityLatLon[0] +"&lon="+ JsonStoring.newTaipeiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAOYUAN_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.taoYuanCityLatLon[0] +"&lon="+ JsonStoring.taoYuanCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HSINCHUCITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.hsinChuCityLatLon[0] +"&lon="+ JsonStoring.hsinChuCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HSINCHUCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.hsinChuCountyLatLon[0] +"&lon="+ JsonStoring.hsinChuCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String MIAOLICOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.miaoLiCountyLatLon[0] +"&lon="+ JsonStoring.miaoLiCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAICHUNGCITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.taichungCityLatLon[0] +"&lon="+ JsonStoring.taichungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHANGHUACOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.changHuaCountyLatLon[0] +"&lon="+ JsonStoring.changHuaCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String YUNLINCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.yunLinCountyLatLon[0] +"&lon="+ JsonStoring.yunLinCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHIAYICITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.chiaYiCityLatLon[0] +"&lon="+ JsonStoring.chiaYiCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String CHIAYICOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.chiaYiCountyLatLon[0] +"&lon="+ JsonStoring.chiaYiCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAINANCITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.taiNanCityLatLon[0] +"&lon="+ JsonStoring.taiNanCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KAOHSIUNGCITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.kaoHsiungCityLatLon[0] +"&lon="+ JsonStoring.kaoHsiungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String PINGTUNGCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.pingTungCountyLatLon[0] +"&lon="+ JsonStoring.pingTungCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String TAITUNG_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.taiTungCountyLatLon[0] +"&lon="+ JsonStoring.taiTungCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HUALIENCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.huaLienCountyLatLon[0] +"&lon="+ JsonStoring.huaLienCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String YILANCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.yiLanCountyLatLon[0] +"&lon="+ JsonStoring.yiLanCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String KEELUNGCITY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.keeLungCityLatLon[0] +"&lon="+ JsonStoring.keeLungCityLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String NANTOUCOUNTY_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.nanTouCountyLatLon[0] +"&lon="+ JsonStoring.nanTouCountyLatLon[1] +"&units=metric&appid=" + apiKey;
    public static final String HENGCHUN_30D_URL = "https://pro.openweathermap.org/data/2.5/forecast/climate?lat="+ JsonStoring.hengChunLatLon[0] +"&lon="+ JsonStoring.hengChunLatLon[1] +"&units=metric&appid=" + apiKey;

    public static final String LIENCHIANG_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.lienChiangLatLon[0] +"&lon="+ JsonStoring.lienChiangLatLon[1] +"&appid=" + apiKey;
    public static final String KINMEN_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.kinMenLatLon[0] +"&lon="+ JsonStoring.kinMenLatLon[1] +"&appid=" + apiKey;
    public static final String PENGHU_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.penGhuLatLon[0] +"&lon="+ JsonStoring.penGhuLatLon[1] +"&appid=" + apiKey;
    public static final String TAIPEICITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.taipeiCityLatLon[0] +"&lon="+ JsonStoring.taipeiCityLatLon[1] +"&appid=" + apiKey;
    public static final String NEWTAIPEICITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.newTaipeiCityLatLon[0] +"&lon="+ JsonStoring.newTaipeiCityLatLon[1] +"&appid=" + apiKey;
    public static final String TAOYUAN_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.taoYuanCityLatLon[0] +"&lon="+ JsonStoring.taoYuanCityLatLon[1] +"&appid=" + apiKey;
    public static final String HSINCHUCITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.hsinChuCityLatLon[0] +"&lon="+ JsonStoring.hsinChuCityLatLon[1] +"&appid=" + apiKey;
    public static final String HSINCHUCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.hsinChuCountyLatLon[0] +"&lon="+ JsonStoring.hsinChuCountyLatLon[1] +"&appid=" + apiKey;
    public static final String MIAOLICOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.miaoLiCountyLatLon[0] +"&lon="+ JsonStoring.miaoLiCountyLatLon[1] +"&appid=" + apiKey;
    public static final String TAICHUNGCITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.taichungCityLatLon[0] +"&lon="+ JsonStoring.taichungCityLatLon[1] +"&appid=" + apiKey;
    public static final String CHANGHUACOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.changHuaCountyLatLon[0] +"&lon="+ JsonStoring.changHuaCountyLatLon[1] +"&appid=" + apiKey;
    public static final String YUNLINCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.yunLinCountyLatLon[0] +"&lon="+ JsonStoring.yunLinCountyLatLon[1] +"&appid=" + apiKey;
    public static final String CHIAYICITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.chiaYiCityLatLon[0] +"&lon="+ JsonStoring.chiaYiCityLatLon[1] +"&appid=" + apiKey;
    public static final String CHIAYICOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.chiaYiCountyLatLon[0] +"&lon="+ JsonStoring.chiaYiCountyLatLon[1] +"&appid=" + apiKey;
    public static final String TAINANCITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.taiNanCityLatLon[0] +"&lon="+ JsonStoring.taiNanCityLatLon[1] +"&appid=" + apiKey;
    public static final String KAOHSIUNGCITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.kaoHsiungCityLatLon[0] +"&lon="+ JsonStoring.kaoHsiungCityLatLon[1] +"&appid=" + apiKey;
    public static final String PINGTUNGCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.pingTungCountyLatLon[0] +"&lon="+ JsonStoring.pingTungCountyLatLon[1] +"&appid=" + apiKey;
    public static final String TAITUNG_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.taiTungCountyLatLon[0] +"&lon="+ JsonStoring.taiTungCountyLatLon[1] +"&appid=" + apiKey;
    public static final String HUALIENCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.huaLienCountyLatLon[0] +"&lon="+ JsonStoring.huaLienCountyLatLon[1] +"&appid=" + apiKey;
    public static final String YILANCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.yiLanCountyLatLon[0] +"&lon="+ JsonStoring.yiLanCountyLatLon[1] +"&appid=" + apiKey;
    public static final String KEELUNGCITY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.keeLungCityLatLon[0] +"&lon="+ JsonStoring.keeLungCityLatLon[1] +"&appid=" + apiKey;
    public static final String NANTOUCOUNTY_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.nanTouCountyLatLon[0] +"&lon="+ JsonStoring.nanTouCountyLatLon[1] +"&appid=" + apiKey;
    public static final String HENGCHUN_AP_URL = "http://api.openweathermap.org/data/2.5/air_pollution?lat="+ JsonStoring.hengChunLatLon[0] +"&lon="+ JsonStoring.hengChunLatLon[1] +"&appid=" + apiKey;

    public static final String EARTHQUAKE_URL = "https://opendata.cwb.gov.tw/api/v1/rest/datastore/E-A0015-001?Authorization="+ cwbApiKey +"&areaName=";


    public static final String[]locationName = {"LienChiang", "KinMen", "PenGhu", "TaipeiCity",
            "NewTaipeiCity", "TaoYuanCity", "HsinChuCity", "HsinChuCounty",
            "MiaoLiCounty", "TaichungCity", "ChangHuaCounty", "YunLinCounty",
            "ChiaYiCounty", "ChiaYiCity", "TaiNanCity", "kaoHsiungCity",
            "PingTungCounty", "TaiTungCounty", "HuaLienCounty", "YiLanCounty",
            "KeeLungCity", "NanTouCounty", "HengChun"};





    public static  JSONArray[] jsongetArray = {JsonStoring.getLienChiang(), JsonStoring.getKinMen(), JsonStoring.getPenGhu(), JsonStoring.getTaipeiCity(),
            JsonStoring.getNewTaipeiCity(), JsonStoring.getTaoYuanCity(), JsonStoring.getHsinChuCity(), JsonStoring.getHsinChuCounty(),
            JsonStoring.getMiaoLiCounty(), JsonStoring.getTaichungCity(), JsonStoring.getChangHuaCounty(), JsonStoring.getYunLinCounty(),
            JsonStoring.getChiaYiCounty(), JsonStoring.getChiaYiCity(), JsonStoring.getTaiNanCity(), JsonStoring.getKaoHsiungCity(),
            JsonStoring.getPingTungCounty(), JsonStoring.getTaiTungCounty(), JsonStoring.getHuaLienCounty(), JsonStoring.getYiLanCounty(),
            JsonStoring.getKeeLungCity(), JsonStoring.getNanTouCounty(), JsonStoring.getHengChun()};

    public static  JSONArray[] jsongetCuArray = {JsonStoring.getLienChiangCu(), JsonStoring.getKinMenCu(), JsonStoring.getPenGhuCu(), JsonStoring.getTaipeiCityCu(),
            JsonStoring.getNewTaipeiCityCu(), JsonStoring.getTaoYuanCityCu(), JsonStoring.getHsinChuCityCu(), JsonStoring.getHsinChuCountyCu(),
            JsonStoring.getMiaoLiCountyCu(), JsonStoring.getTaichungCityCu(), JsonStoring.getChangHuaCountyCu(), JsonStoring.getYunLinCountyCu(),
            JsonStoring.getChiaYiCountyCu(), JsonStoring.getChiaYiCityCu(), JsonStoring.getTaiNanCityCu(), JsonStoring.getKaoHsiungCityCu(),
            JsonStoring.getPingTungCountyCu(), JsonStoring.getTaiTungCountyCu(), JsonStoring.getHuaLienCountyCu(), JsonStoring.getYiLanCountyCu(),
            JsonStoring.getKeeLungCityCu(), JsonStoring.getNanTouCountyCu(), JsonStoring.getHengChunCu()};

    public static  JSONArray[] jsonget30DArray = {JsonStoring.getLienChiang30D(), JsonStoring.getKinMen30D(), JsonStoring.getPenGhu30D(), JsonStoring.getTaipeiCity30D(),
            JsonStoring.getNewTaipeiCity30D(), JsonStoring.getTaoYuanCity30D(), JsonStoring.getHsinChuCity30D(), JsonStoring.getHsinChuCounty30D(),
            JsonStoring.getMiaoLiCounty30D(), JsonStoring.getTaichungCity30D(), JsonStoring.getChangHuaCounty30D(), JsonStoring.getYunLinCounty30D(),
            JsonStoring.getChiaYiCounty30D(), JsonStoring.getChiaYiCity30D(), JsonStoring.getTaiNanCity30D(), JsonStoring.getKaoHsiungCity30D(),
            JsonStoring.getPingTungCounty30D(), JsonStoring.getTaiTungCounty30D(), JsonStoring.getHuaLienCounty30D(), JsonStoring.getYiLanCounty30D(),
            JsonStoring.getKeeLungCity30D(), JsonStoring.getNanTouCounty30D(), JsonStoring.getHengChun30D()};

    public static  JSONArray[] jsongetAPArray = {JsonStoring.getLienChiangAP(), JsonStoring.getKinMenAP(), JsonStoring.getPenGhuAP(), JsonStoring.getTaipeiCityAP(),
            JsonStoring.getNewTaipeiCityAP(), JsonStoring.getTaoYuanCityAP(), JsonStoring.getHsinChuCityAP(), JsonStoring.getHsinChuCountyAP(),
            JsonStoring.getMiaoLiCountyAP(), JsonStoring.getTaichungCityAP(), JsonStoring.getChangHuaCountyAP(), JsonStoring.getYunLinCountyAP(),
            JsonStoring.getChiaYiCountyAP(), JsonStoring.getChiaYiCityAP(), JsonStoring.getTaiNanCityAP(), JsonStoring.getKaoHsiungCityAP(),
            JsonStoring.getPingTungCountyAP(), JsonStoring.getTaiTungCountyAP(), JsonStoring.getHuaLienCountyAP(), JsonStoring.getYiLanCountyAP(),
            JsonStoring.getKeeLungCityAP(), JsonStoring.getNanTouCountyAP(), JsonStoring.getHengChunAP()};


    public static JSONArray getLienChiangAP() {
        return lienChiangAP;
    }

    public static void setLienChiangAP(JSONArray lienChiangAP) {
        JsonStoring.lienChiangAP = lienChiangAP;
    }

    public static JSONArray getKinMenAP() {
        return kinMenAP;
    }

    public static void setKinMenAP(JSONArray kinMenAP) {
        JsonStoring.kinMenAP = kinMenAP;
    }

    public static JSONArray getPenGhuAP() {
        return penGhuAP;
    }

    public static void setPenGhuAP(JSONArray penGhuAP) {
        JsonStoring.penGhuAP = penGhuAP;
    }

    public static JSONArray getTaipeiCityAP() {
        return taipeiCityAP;
    }

    public static void setTaipeiCityAP(JSONArray taipeiCityAP) {
        JsonStoring.taipeiCityAP = taipeiCityAP;
    }

    public static JSONArray getNewTaipeiCityAP() {
        return newTaipeiCityAP;
    }

    public static void setNewTaipeiCityAP(JSONArray newTaipeiCityAP) {
        JsonStoring.newTaipeiCityAP = newTaipeiCityAP;
    }

    public static JSONArray getTaoYuanCityAP() {
        return taoYuanCityAP;
    }

    public static void setTaoYuanCityAP(JSONArray taoYuanCityAP) {
        JsonStoring.taoYuanCityAP = taoYuanCityAP;
    }

    public static JSONArray getHsinChuCityAP() {
        return hsinChuCityAP;
    }

    public static void setHsinChuCityAP(JSONArray hsinChuCityAP) {
        JsonStoring.hsinChuCityAP = hsinChuCityAP;
    }

    public static JSONArray getHsinChuCountyAP() {
        return hsinChuCountyAP;
    }

    public static void setHsinChuCountyAP(JSONArray hsinChuCountyAP) {
        JsonStoring.hsinChuCountyAP = hsinChuCountyAP;
    }

    public static JSONArray getMiaoLiCountyAP() {
        return miaoLiCountyAP;
    }

    public static void setMiaoLiCountyAP(JSONArray miaoLiCountyAP) {
        JsonStoring.miaoLiCountyAP = miaoLiCountyAP;
    }

    public static JSONArray getTaichungCityAP() {
        return taichungCityAP;
    }

    public static void setTaichungCityAP(JSONArray taichungCityAP) {
        JsonStoring.taichungCityAP = taichungCityAP;
    }

    public static JSONArray getChangHuaCountyAP() {
        return changHuaCountyAP;
    }

    public static void setChangHuaCountyAP(JSONArray changHuaCountyAP) {
        JsonStoring.changHuaCountyAP = changHuaCountyAP;
    }

    public static JSONArray getYunLinCountyAP() {
        return yunLinCountyAP;
    }

    public static void setYunLinCountyAP(JSONArray yunLinCountyAP) {
        JsonStoring.yunLinCountyAP = yunLinCountyAP;
    }

    public static JSONArray getChiaYiCountyAP() {
        return chiaYiCountyAP;
    }

    public static void setChiaYiCountyAP(JSONArray chiaYiCountyAP) {
        JsonStoring.chiaYiCountyAP = chiaYiCountyAP;
    }

    public static JSONArray getChiaYiCityAP() {
        return chiaYiCityAP;
    }

    public static void setChiaYiCityAP(JSONArray chiaYiCityAP) {
        JsonStoring.chiaYiCityAP = chiaYiCityAP;
    }

    public static JSONArray getTaiNanCityAP() {
        return taiNanCityAP;
    }

    public static void setTaiNanCityAP(JSONArray taiNanCityAP) {
        JsonStoring.taiNanCityAP = taiNanCityAP;
    }

    public static JSONArray getKaoHsiungCityAP() {
        return kaoHsiungCityAP;
    }

    public static void setKaoHsiungCityAP(JSONArray kaoHsiungCityAP) {
        JsonStoring.kaoHsiungCityAP = kaoHsiungCityAP;
    }

    public static JSONArray getPingTungCountyAP() {
        return pingTungCountyAP;
    }

    public static void setPingTungCountyAP(JSONArray pingTungCountyAP) {
        JsonStoring.pingTungCountyAP = pingTungCountyAP;
    }

    public static JSONArray getTaiTungCountyAP() {
        return taiTungCountyAP;
    }

    public static void setTaiTungCountyAP(JSONArray taiTungCountyAP) {
        JsonStoring.taiTungCountyAP = taiTungCountyAP;
    }

    public static JSONArray getHuaLienCountyAP() {
        return huaLienCountyAP;
    }

    public static void setHuaLienCountyAP(JSONArray huaLienCountyAP) {
        JsonStoring.huaLienCountyAP = huaLienCountyAP;
    }

    public static JSONArray getYiLanCountyAP() {
        return yiLanCountyAP;
    }

    public static void setYiLanCountyAP(JSONArray yiLanCountyAP) {
        JsonStoring.yiLanCountyAP = yiLanCountyAP;
    }

    public static JSONArray getKeeLungCityAP() {
        return keeLungCityAP;
    }

    public static void setKeeLungCityAP(JSONArray keeLungCityAP) {
        JsonStoring.keeLungCityAP = keeLungCityAP;
    }

    public static JSONArray getNanTouCountyAP() {
        return nanTouCountyAP;
    }

    public static void setNanTouCountyAP(JSONArray nanTouCountyAP) {
        JsonStoring.nanTouCountyAP = nanTouCountyAP;
    }

    public static JSONArray getHengChunAP() {
        return hengChunAP;
    }

    public static void setHengChunAP(JSONArray hengChunAP) {
        JsonStoring.hengChunAP = hengChunAP;
    }

    public static JSONArray getLienChiang30D() {
        return lienChiang30D;
    }

    public static void setLienChiang30D(JSONArray lienChiang30D) {
        JsonStoring.lienChiang30D = lienChiang30D;
    }

    public static JSONArray getKinMen30D() {
        return kinMen30D;
    }

    public static void setKinMen30D(JSONArray kinMen30D) {
        JsonStoring.kinMen30D = kinMen30D;
    }

    public static JSONArray getPenGhu30D() {
        return penGhu30D;
    }

    public static void setPenGhu30D(JSONArray penGhu30D) {
        JsonStoring.penGhu30D = penGhu30D;
    }

    public static JSONArray getTaipeiCity30D() {
        return taipeiCity30D;
    }

    public static void setTaipeiCity30D(JSONArray taipeiCity30D) {
        JsonStoring.taipeiCity30D = taipeiCity30D;
    }

    public static JSONArray getNewTaipeiCity30D() {
        return newTaipeiCity30D;
    }

    public static void setNewTaipeiCity30D(JSONArray newTaipeiCity30D) {
        JsonStoring.newTaipeiCity30D = newTaipeiCity30D;
    }

    public static JSONArray getTaoYuanCity30D() {
        return taoYuanCity30D;
    }

    public static void setTaoYuanCity30D(JSONArray taoYuanCity30D) {
        JsonStoring.taoYuanCity30D = taoYuanCity30D;
    }

    public static JSONArray getHsinChuCity30D() {
        return hsinChuCity30D;
    }

    public static void setHsinChuCity30D(JSONArray hsinChuCity30D) {
        JsonStoring.hsinChuCity30D = hsinChuCity30D;
    }

    public static JSONArray getHsinChuCounty30D() {
        return hsinChuCounty30D;
    }

    public static void setHsinChuCounty30D(JSONArray hsinChuCounty30D) {
        JsonStoring.hsinChuCounty30D = hsinChuCounty30D;
    }

    public static JSONArray getMiaoLiCounty30D() {
        return miaoLiCounty30D;
    }

    public static void setMiaoLiCounty30D(JSONArray miaoLiCounty30D) {
        JsonStoring.miaoLiCounty30D = miaoLiCounty30D;
    }

    public static JSONArray getTaichungCity30D() {
        return taichungCity30D;
    }

    public static void setTaichungCity30D(JSONArray taichungCity30D) {
        JsonStoring.taichungCity30D = taichungCity30D;
    }

    public static JSONArray getChangHuaCounty30D() {
        return changHuaCounty30D;
    }

    public static void setChangHuaCounty30D(JSONArray changHuaCounty30D) {
        JsonStoring.changHuaCounty30D = changHuaCounty30D;
    }

    public static JSONArray getYunLinCounty30D() {
        return yunLinCounty30D;
    }

    public static void setYunLinCounty30D(JSONArray yunLinCounty30D) {
        JsonStoring.yunLinCounty30D = yunLinCounty30D;
    }

    public static JSONArray getChiaYiCounty30D() {
        return chiaYiCounty30D;
    }

    public static void setChiaYiCounty30D(JSONArray chiaYiCounty30D) {
        JsonStoring.chiaYiCounty30D = chiaYiCounty30D;
    }

    public static JSONArray getChiaYiCity30D() {
        return chiaYiCity30D;
    }

    public static void setChiaYiCity30D(JSONArray chiaYiCity30D) {
        JsonStoring.chiaYiCity30D = chiaYiCity30D;
    }

    public static JSONArray getTaiNanCity30D() {
        return taiNanCity30D;
    }

    public static void setTaiNanCity30D(JSONArray taiNanCity30D) {
        JsonStoring.taiNanCity30D = taiNanCity30D;
    }

    public static JSONArray getKaoHsiungCity30D() {
        return kaoHsiungCity30D;
    }

    public static void setKaoHsiungCity30D(JSONArray kaoHsiungCity30D) {
        JsonStoring.kaoHsiungCity30D = kaoHsiungCity30D;
    }

    public static JSONArray getPingTungCounty30D() {
        return pingTungCounty30D;
    }

    public static void setPingTungCounty30D(JSONArray pingTungCounty30D) {
        JsonStoring.pingTungCounty30D = pingTungCounty30D;
    }

    public static JSONArray getTaiTungCounty30D() {
        return taiTungCounty30D;
    }

    public static void setTaiTungCounty30D(JSONArray taiTungCounty30D) {
        JsonStoring.taiTungCounty30D = taiTungCounty30D;
    }

    public static JSONArray getHuaLienCounty30D() {
        return huaLienCounty30D;
    }

    public static void setHuaLienCounty30D(JSONArray huaLienCounty30D) {
        JsonStoring.huaLienCounty30D = huaLienCounty30D;
    }

    public static JSONArray getYiLanCounty30D() {
        return yiLanCounty30D;
    }

    public static void setYiLanCounty30D(JSONArray yiLanCounty30D) {
        JsonStoring.yiLanCounty30D = yiLanCounty30D;
    }

    public static JSONArray getKeeLungCity30D() {
        return keeLungCity30D;
    }

    public static void setKeeLungCity30D(JSONArray keeLungCity30D) {
        JsonStoring.keeLungCity30D = keeLungCity30D;
    }

    public static JSONArray getNanTouCounty30D() {
        return nanTouCounty30D;
    }

    public static void setNanTouCounty30D(JSONArray nanTouCounty30D) {
        JsonStoring.nanTouCounty30D = nanTouCounty30D;
    }

    public static JSONArray getHengChun30D() {
        return hengChun30D;
    }

    public static void setHengChun30D(JSONArray hengChun30D) {
        JsonStoring.hengChun30D = hengChun30D;
    }

    public static JSONArray getLienChiangCu() {
        return lienChiangCu;
    }

    public static void setLienChiangCu(JSONArray lienChiangCu) {
        JsonStoring.lienChiangCu = lienChiangCu;
    }

    public static JSONArray getKinMenCu() {
        return kinMenCu;
    }

    public static void setKinMenCu(JSONArray kinMenCu) {
        JsonStoring.kinMenCu = kinMenCu;
    }

    public static JSONArray getPenGhuCu() {
        return penGhuCu;
    }

    public static void setPenGhuCu(JSONArray penGhuCu) {
        JsonStoring.penGhuCu = penGhuCu;
    }

    public static JSONArray getTaipeiCityCu() {
        return taipeiCityCu;
    }

    public static void setTaipeiCityCu(JSONArray taipeiCityCu) {
        JsonStoring.taipeiCityCu = taipeiCityCu;
    }

    public static JSONArray getNewTaipeiCityCu() {
        return newTaipeiCityCu;
    }

    public static void setNewTaipeiCityCu(JSONArray newTaipeiCityCu) {
        JsonStoring.newTaipeiCityCu = newTaipeiCityCu;
    }

    public static JSONArray getTaoYuanCityCu() {
        return taoYuanCityCu;
    }

    public static void setTaoYuanCityCu(JSONArray taoYuanCityCu) {
        JsonStoring.taoYuanCityCu = taoYuanCityCu;
    }

    public static JSONArray getHsinChuCityCu() {
        return hsinChuCityCu;
    }

    public static void setHsinChuCityCu(JSONArray hsinChuCityCu) {
        JsonStoring.hsinChuCityCu = hsinChuCityCu;
    }

    public static JSONArray getHsinChuCountyCu() {
        return hsinChuCountyCu;
    }

    public static void setHsinChuCountyCu(JSONArray hsinChuCountyCu) {
        JsonStoring.hsinChuCountyCu = hsinChuCountyCu;
    }

    public static JSONArray getMiaoLiCountyCu() {
        return miaoLiCountyCu;
    }

    public static void setMiaoLiCountyCu(JSONArray miaoLiCountyCu) {
        JsonStoring.miaoLiCountyCu = miaoLiCountyCu;
    }

    public static JSONArray getTaichungCityCu() {
        return taichungCityCu;
    }

    public static void setTaichungCityCu(JSONArray taichungCityCu) {
        JsonStoring.taichungCityCu = taichungCityCu;
    }

    public static JSONArray getChangHuaCountyCu() {
        return changHuaCountyCu;
    }

    public static void setChangHuaCountyCu(JSONArray changHuaCountyCu) {
        JsonStoring.changHuaCountyCu = changHuaCountyCu;
    }

    public static JSONArray getYunLinCountyCu() {
        return yunLinCountyCu;
    }

    public static void setYunLinCountyCu(JSONArray yunLinCountyCu) {
        JsonStoring.yunLinCountyCu = yunLinCountyCu;
    }

    public static JSONArray getChiaYiCountyCu() {
        return chiaYiCountyCu;
    }

    public static void setChiaYiCountyCu(JSONArray chiaYiCountyCu) {
        JsonStoring.chiaYiCountyCu = chiaYiCountyCu;
    }

    public static JSONArray getChiaYiCityCu() {
        return chiaYiCityCu;
    }

    public static void setChiaYiCityCu(JSONArray chiaYiCityCu) {
        JsonStoring.chiaYiCityCu = chiaYiCityCu;
    }

    public static JSONArray getTaiNanCityCu() {
        return taiNanCityCu;
    }

    public static void setTaiNanCityCu(JSONArray taiNanCityCu) {
        JsonStoring.taiNanCityCu = taiNanCityCu;
    }

    public static JSONArray getKaoHsiungCityCu() {
        return kaoHsiungCityCu;
    }

    public static void setKaoHsiungCityCu(JSONArray kaoHsiungCityCu) {
        JsonStoring.kaoHsiungCityCu = kaoHsiungCityCu;
    }

    public static JSONArray getPingTungCountyCu() {
        return pingTungCountyCu;
    }

    public static void setPingTungCountyCu(JSONArray pingTungCountyCu) {
        JsonStoring.pingTungCountyCu = pingTungCountyCu;
    }

    public static JSONArray getTaiTungCountyCu() {
        return taiTungCountyCu;
    }

    public static void setTaiTungCountyCu(JSONArray taiTungCountyCu) {
        JsonStoring.taiTungCountyCu = taiTungCountyCu;
    }

    public static JSONArray getHuaLienCountyCu() {
        return huaLienCountyCu;
    }

    public static void setHuaLienCountyCu(JSONArray huaLienCountyCu) {
        JsonStoring.huaLienCountyCu = huaLienCountyCu;
    }

    public static JSONArray getYiLanCountyCu() {
        return yiLanCountyCu;
    }

    public static void setYiLanCountyCu(JSONArray yiLanCountyCu) {
        JsonStoring.yiLanCountyCu = yiLanCountyCu;
    }

    public static JSONArray getKeeLungCityCu() {
        return keeLungCityCu;
    }

    public static void setKeeLungCityCu(JSONArray keeLungCityCu) {
        JsonStoring.keeLungCityCu = keeLungCityCu;
    }

    public static JSONArray getNanTouCountyCu() {
        return nanTouCountyCu;
    }

    public static void setNanTouCountyCu(JSONArray nanTouCountyCu) {
        JsonStoring.nanTouCountyCu = nanTouCountyCu;
    }

    public static JSONArray getHengChunCu() {
        return hengChunCu;
    }

    public static void setHengChunCu(JSONArray hengChunCu) {
        JsonStoring.hengChunCu = hengChunCu;
    }

    public static JSONArray getHengChun() {
        return hengChun;
    }

    public static void setHengChun(JSONArray hengChun) {
        JsonStoring.hengChun = hengChun;
    }

    public static JSONArray getLienChiang() {
        return lienChiang;
    }

    public static void setLienChiang(JSONArray lienChiang) {
        JsonStoring.lienChiang = lienChiang;
    }

    public static JSONArray getKinMen() {
        return kinMen;
    }

    public static void setKinMen(JSONArray kinMen) {
        JsonStoring.kinMen = kinMen;
    }

    public static JSONArray getPenGhu() {
        return penGhu;
    }

    public static void setPenGhu(JSONArray penGhu) {
        JsonStoring.penGhu = penGhu;
    }

    public static JSONArray getTaipeiCity() {
        return taipeiCity;
    }

    public static void setTaipeiCity(JSONArray taipeiCity) {
        JsonStoring.taipeiCity = taipeiCity;
    }

    public static JSONArray getNewTaipeiCity() {
        return newTaipeiCity;
    }

    public static void setNewTaipeiCity(JSONArray newTaipeiCity) {
        JsonStoring.newTaipeiCity = newTaipeiCity;
    }

    public static JSONArray getTaoYuanCity() {
        return taoYuanCity;
    }

    public static void setTaoYuanCity(JSONArray taoYuanCity) {
        JsonStoring.taoYuanCity = taoYuanCity;
    }

    public static JSONArray getHsinChuCity() {
        return hsinChuCity;
    }

    public static void setHsinChuCity(JSONArray hsinChuCity) {
        JsonStoring.hsinChuCity = hsinChuCity;
    }

    public static JSONArray getHsinChuCounty() {
        return hsinChuCounty;
    }

    public static void setHsinChuCounty(JSONArray hsinChuCounty) {
        JsonStoring.hsinChuCounty = hsinChuCounty;
    }

    public static JSONArray getMiaoLiCounty() {
        return miaoLiCounty;
    }

    public static void setMiaoLiCounty(JSONArray miaoLiCounty) {
        JsonStoring.miaoLiCounty = miaoLiCounty;
    }

    public static JSONArray getTaichungCity() {
        return taichungCity;
    }

    public static void setTaichungCity(JSONArray taichungCity) {
        JsonStoring.taichungCity = taichungCity;
    }

    public static JSONArray getChangHuaCounty() {
        return changHuaCounty;
    }

    public static void setChangHuaCounty(JSONArray changHuaCounty) {
        JsonStoring.changHuaCounty = changHuaCounty;
    }

    public static JSONArray getYunLinCounty() {
        return yunLinCounty;
    }

    public static void setYunLinCounty(JSONArray yunLinCounty) {
        JsonStoring.yunLinCounty = yunLinCounty;
    }

    public static JSONArray getChiaYiCounty() {
        return chiaYiCounty;
    }

    public static void setChiaYiCounty(JSONArray chiaYiCounty) {
        JsonStoring.chiaYiCounty = chiaYiCounty;
    }

    public static JSONArray getChiaYiCity() {
        return chiaYiCity;
    }

    public static void setChiaYiCity(JSONArray chiaYiCity) {
        JsonStoring.chiaYiCity = chiaYiCity;
    }

    public static JSONArray getTaiNanCity() {
        return taiNanCity;
    }

    public static void setTaiNanCity(JSONArray taiNanCity) {
        JsonStoring.taiNanCity = taiNanCity;
    }

    public static JSONArray getKaoHsiungCity() {
        return kaoHsiungCity;
    }

    public static void setKaoHsiungCity(JSONArray kaoHsiungCity) {
        JsonStoring.kaoHsiungCity = kaoHsiungCity;
    }

    public static JSONArray getPingTungCounty() {
        return pingTungCounty;
    }

    public static void setPingTungCounty(JSONArray pingTungCounty) {
        JsonStoring.pingTungCounty = pingTungCounty;
    }

    public static JSONArray getTaiTungCounty() {
        return taiTungCounty;
    }

    public static void setTaiTungCounty(JSONArray taiTungCounty) {
        JsonStoring.taiTungCounty = taiTungCounty;
    }

    public static JSONArray getHuaLienCounty() {
        return huaLienCounty;
    }

    public static void setHuaLienCounty(JSONArray huaLienCounty) {
        JsonStoring.huaLienCounty = huaLienCounty;
    }

    public static JSONArray getYiLanCounty() {
        return yiLanCounty;
    }

    public static void setYiLanCounty(JSONArray yiLanCounty) {
        JsonStoring.yiLanCounty = yiLanCounty;
    }

    public static JSONArray getKeeLungCity() {
        return keeLungCity;
    }

    public static void setKeeLungCity(JSONArray keeLungCity) {
        JsonStoring.keeLungCity = keeLungCity;
    }

    public static JSONArray getNanTouCounty() {
        return nanTouCounty;
    }

    public static void setNanTouCounty(JSONArray nanTouCounty) {
        JsonStoring.nanTouCounty = nanTouCounty;
    }

    public static void updateDnHJSONArray(JsonUrlConnect jsonUrlConnect){
        lienChiang = jsonUrlConnect.jsonArray(LIENCHIANG_DNH_URL);
        kinMen = jsonUrlConnect.jsonArray(KINMEN_DNH_URL);
        penGhu = jsonUrlConnect.jsonArray(PENGHU_DNH_URL);
        taipeiCity = jsonUrlConnect.jsonArray(TAIPEICITY_DNH_URL);
        newTaipeiCity = jsonUrlConnect.jsonArray(NEWTAIPEICITY_DNH_URL);
        taoYuanCity = jsonUrlConnect.jsonArray(TAOYUAN_DNH_URL);
        hsinChuCity = jsonUrlConnect.jsonArray(HSINCHUCITY_DNH_URL);
        hsinChuCounty = jsonUrlConnect.jsonArray(HSINCHUCOUNTY_DNH_URL);
        miaoLiCounty = jsonUrlConnect.jsonArray(MIAOLICOUNTY_DNH_URL);
        taichungCity = jsonUrlConnect.jsonArray(TAICHUNGCITY_DNH_URL);
        changHuaCounty = jsonUrlConnect.jsonArray(CHANGHUACOUNTY_DNH_URL);
        yunLinCounty = jsonUrlConnect.jsonArray(YUNLINCOUNTY_DNH_URL);
        chiaYiCounty = jsonUrlConnect.jsonArray(CHIAYICOUNTY_DNH_URL);
        chiaYiCity = jsonUrlConnect.jsonArray(CHIAYICITY_DNH_URL);
        taiNanCity = jsonUrlConnect.jsonArray(TAINANCITY_DNH_URL);
        kaoHsiungCity = jsonUrlConnect.jsonArray(KAOHSIUNGCITY_DNH_URL);
        pingTungCounty = jsonUrlConnect.jsonArray(PINGTUNGCOUNTY_DNH_URL);
        taiTungCounty = jsonUrlConnect.jsonArray(TAITUNG_DNH_URL);
        huaLienCounty = jsonUrlConnect.jsonArray(HUALIENCOUNTY_DNH_URL);
        yiLanCounty = jsonUrlConnect.jsonArray(YILANCOUNTY_DNH_URL);
        keeLungCity = jsonUrlConnect.jsonArray(KEELUNGCITY_DNH_URL);
        nanTouCounty = jsonUrlConnect.jsonArray(NANTOUCOUNTY_DNH_URL);
        hengChun = jsonUrlConnect.jsonArray(HENGCHUN_DNH_URL);
        System.out.println("Day and Hour JSONArray updated | "+ LocalDateTime.now());
    }

    public static void updateCuJSONArray(JsonUrlConnect jsonUrlConnect){
        lienChiangCu = jsonUrlConnect.jsonArray(LIENCHIANG_CU_URL);
        kinMenCu = jsonUrlConnect.jsonArray(KINMEN_CU_URL);
        penGhuCu = jsonUrlConnect.jsonArray(PENGHU_CU_URL);
        taipeiCityCu = jsonUrlConnect.jsonArray(TAIPEICITY_CU_URL);
        newTaipeiCityCu = jsonUrlConnect.jsonArray(NEWTAIPEICITY_CU_URL);
        taoYuanCityCu = jsonUrlConnect.jsonArray(TAOYUAN_CU_URL);
        hsinChuCityCu = jsonUrlConnect.jsonArray(HSINCHUCITY_CU_URL);
        hsinChuCountyCu = jsonUrlConnect.jsonArray(HSINCHUCOUNTY_CU_URL);
        miaoLiCountyCu = jsonUrlConnect.jsonArray(MIAOLICOUNTY_CU_URL);
        taichungCityCu = jsonUrlConnect.jsonArray(TAICHUNGCITY_CU_URL);
        changHuaCountyCu = jsonUrlConnect.jsonArray(CHANGHUACOUNTY_CU_URL);
        yunLinCountyCu = jsonUrlConnect.jsonArray(YUNLINCOUNTY_CU_URL);
        chiaYiCountyCu = jsonUrlConnect.jsonArray(CHIAYICOUNTY_CU_URL);
        chiaYiCityCu = jsonUrlConnect.jsonArray(CHIAYICITY_CU_URL);
        taiNanCityCu = jsonUrlConnect.jsonArray(TAINANCITY_CU_URL);
        kaoHsiungCityCu = jsonUrlConnect.jsonArray(KAOHSIUNGCITY_CU_URL);
        pingTungCountyCu = jsonUrlConnect.jsonArray(PINGTUNGCOUNTY_CU_URL);
        taiTungCountyCu = jsonUrlConnect.jsonArray(TAITUNG_CU_URL);
        huaLienCountyCu = jsonUrlConnect.jsonArray(HUALIENCOUNTY_CU_URL);
        yiLanCountyCu = jsonUrlConnect.jsonArray(YILANCOUNTY_CU_URL);
        keeLungCityCu = jsonUrlConnect.jsonArray(KEELUNGCITY_CU_URL);
        nanTouCountyCu = jsonUrlConnect.jsonArray(NANTOUCOUNTY_CU_URL);
        hengChunCu = jsonUrlConnect.jsonArray(HENGCHUN_CU_URL);
        System.out.println("Current JSONArray updated | "+ LocalDateTime.now());
    }

    public static void update30DJSONArray(JsonUrlConnect jsonUrlConnect){
        lienChiang30D = jsonUrlConnect.jsonArray(LIENCHIANG_30D_URL);
        kinMen30D = jsonUrlConnect.jsonArray(KINMEN_30D_URL);
        penGhu30D = jsonUrlConnect.jsonArray(PENGHU_30D_URL);
        taipeiCity30D = jsonUrlConnect.jsonArray(TAIPEICITY_30D_URL);
        newTaipeiCity30D = jsonUrlConnect.jsonArray(NEWTAIPEICITY_30D_URL);
        taoYuanCity30D = jsonUrlConnect.jsonArray(TAOYUAN_30D_URL);
        hsinChuCity30D = jsonUrlConnect.jsonArray(HSINCHUCITY_30D_URL);
        hsinChuCounty30D = jsonUrlConnect.jsonArray(HSINCHUCOUNTY_30D_URL);
        miaoLiCounty30D = jsonUrlConnect.jsonArray(MIAOLICOUNTY_30D_URL);
        taichungCity30D = jsonUrlConnect.jsonArray(TAICHUNGCITY_30D_URL);
        changHuaCounty30D = jsonUrlConnect.jsonArray(CHANGHUACOUNTY_30D_URL);
        yunLinCounty30D = jsonUrlConnect.jsonArray(YUNLINCOUNTY_30D_URL);
        chiaYiCounty30D = jsonUrlConnect.jsonArray(CHIAYICOUNTY_30D_URL);
        chiaYiCity30D = jsonUrlConnect.jsonArray(CHIAYICITY_30D_URL);
        taiNanCity30D = jsonUrlConnect.jsonArray(TAINANCITY_30D_URL);
        kaoHsiungCity30D = jsonUrlConnect.jsonArray(KAOHSIUNGCITY_30D_URL);
        pingTungCounty30D = jsonUrlConnect.jsonArray(PINGTUNGCOUNTY_30D_URL);
        taiTungCounty30D = jsonUrlConnect.jsonArray(TAITUNG_30D_URL);
        huaLienCounty30D = jsonUrlConnect.jsonArray(HUALIENCOUNTY_30D_URL);
        yiLanCounty30D = jsonUrlConnect.jsonArray(YILANCOUNTY_30D_URL);
        keeLungCity30D = jsonUrlConnect.jsonArray(KEELUNGCITY_30D_URL);
        nanTouCounty30D = jsonUrlConnect.jsonArray(NANTOUCOUNTY_30D_URL);
        hengChun30D = jsonUrlConnect.jsonArray(HENGCHUN_30D_URL);
        System.out.println("30Days JSONArray updated | "+ LocalDateTime.now());

    }

    public static void updateAPJSONArray(JsonUrlConnect jsonUrlConnect){
        lienChiangAP = jsonUrlConnect.jsonArray(LIENCHIANG_AP_URL);
        kinMenAP = jsonUrlConnect.jsonArray(KINMEN_AP_URL);
        penGhuAP = jsonUrlConnect.jsonArray(PENGHU_AP_URL);
        taipeiCityAP = jsonUrlConnect.jsonArray(TAIPEICITY_AP_URL);
        newTaipeiCityAP = jsonUrlConnect.jsonArray(NEWTAIPEICITY_AP_URL);
        taoYuanCityAP = jsonUrlConnect.jsonArray(TAOYUAN_AP_URL);
        hsinChuCityAP = jsonUrlConnect.jsonArray(HSINCHUCITY_AP_URL);
        hsinChuCountyAP = jsonUrlConnect.jsonArray(HSINCHUCOUNTY_AP_URL);
        miaoLiCountyAP = jsonUrlConnect.jsonArray(MIAOLICOUNTY_AP_URL);
        taichungCityAP = jsonUrlConnect.jsonArray(TAICHUNGCITY_AP_URL);
        changHuaCountyAP = jsonUrlConnect.jsonArray(CHANGHUACOUNTY_AP_URL);
        yunLinCountyAP = jsonUrlConnect.jsonArray(YUNLINCOUNTY_AP_URL);
        chiaYiCountyAP = jsonUrlConnect.jsonArray(CHIAYICOUNTY_AP_URL);
        chiaYiCityAP = jsonUrlConnect.jsonArray(CHIAYICITY_AP_URL);
        taiNanCityAP = jsonUrlConnect.jsonArray(TAINANCITY_AP_URL);
        kaoHsiungCityAP = jsonUrlConnect.jsonArray(KAOHSIUNGCITY_AP_URL);
        pingTungCountyAP = jsonUrlConnect.jsonArray(PINGTUNGCOUNTY_AP_URL);
        taiTungCountyAP = jsonUrlConnect.jsonArray(TAITUNG_AP_URL);
        huaLienCountyAP = jsonUrlConnect.jsonArray(HUALIENCOUNTY_AP_URL);
        yiLanCountyAP = jsonUrlConnect.jsonArray(YILANCOUNTY_AP_URL);
        keeLungCityAP = jsonUrlConnect.jsonArray(KEELUNGCITY_AP_URL);
        nanTouCountyAP = jsonUrlConnect.jsonArray(NANTOUCOUNTY_AP_URL);
        hengChunAP = jsonUrlConnect.jsonArray(HENGCHUN_AP_URL);
        System.out.println("Air Pollution JSONArray updated | "+ LocalDateTime.now());

    }

    public static void updateEarthquakeArray(JsonUrlConnect jsonUrlConnect){
        earthquake = jsonUrlConnect.jsonArray(EARTHQUAKE_URL);
    }



    public static void updateDnHArray(){
        JsonStoring.jsongetArray = new JSONArray[]{getLienChiang(), getKinMen(), getPenGhu(), getTaipeiCity(),
                getNewTaipeiCity(), getTaoYuanCity(), getHsinChuCity(), getHsinChuCounty(),
                getMiaoLiCounty(), getTaichungCity(), getChangHuaCounty(), getYunLinCounty(),
                getChiaYiCounty(), getChiaYiCity(), getTaiNanCity(), getKaoHsiungCity(),
                getPingTungCounty(), getTaiTungCounty(), getHuaLienCounty(), getYiLanCounty(),
                getKeeLungCity(), getNanTouCounty(), getHengChun()};
    }

    public static void updateCuArray(){
        JsonStoring.jsongetCuArray = new JSONArray[]{getLienChiangCu(), getKinMenCu(), getPenGhuCu(), getTaipeiCityCu(),
                getNewTaipeiCityCu(), getTaoYuanCityCu(), getHsinChuCityCu(), getHsinChuCountyCu(),
                getMiaoLiCountyCu(), getTaichungCityCu(), getChangHuaCountyCu(), getYunLinCountyCu(),
                getChiaYiCountyCu(), getChiaYiCityCu(), getTaiNanCityCu(), getKaoHsiungCityCu(),
                getPingTungCountyCu(), getTaiTungCountyCu(), getHuaLienCountyCu(), getYiLanCountyCu(),
                getKeeLungCityCu(), getNanTouCountyCu(), getHengChunCu()};
    }

    public static void update30DArray(){
        JsonStoring.jsonget30DArray = new JSONArray[]{getLienChiang30D(), getKinMen30D(), getPenGhu30D(), getTaipeiCity30D(),
                getNewTaipeiCity30D(), getTaoYuanCity30D(), getHsinChuCity30D(), getHsinChuCounty30D(),
                getMiaoLiCounty30D(), getTaichungCity30D(), getChangHuaCounty30D(), getYunLinCounty30D(),
                getChiaYiCounty30D(), getChiaYiCity30D(), getTaiNanCity30D(), getKaoHsiungCity30D(),
                getPingTungCounty30D(), getTaiTungCounty30D(), getHuaLienCounty30D(), getYiLanCounty30D(),
                getKeeLungCity30D(), getNanTouCounty30D(), getHengChun30D()};
    }

    public static void updateAPArray(){
        JsonStoring.jsongetAPArray = new JSONArray[]{getLienChiangAP(), getKinMenAP(), getPenGhuAP(), getTaipeiCityAP(),
                getNewTaipeiCityAP(), getTaoYuanCityAP(), getHsinChuCityAP(), getHsinChuCountyAP(),
                getMiaoLiCountyAP(), getTaichungCityAP(), getChangHuaCountyAP(), getYunLinCountyAP(),
                getChiaYiCountyAP(), getChiaYiCityAP(), getTaiNanCityAP(), getKaoHsiungCityAP(),
                getPingTungCountyAP(), getTaiTungCountyAP(), getHuaLienCountyAP(), getYiLanCountyAP(),
                getKeeLungCityAP(), getNanTouCountyAP(), getHengChunAP()};
    }
}