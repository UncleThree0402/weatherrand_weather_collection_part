import model.Datasource;
import model.InsertTable;
import model.JsonUrlConnect;
import model.TimeProcessing;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        InsertTable insertTable = new InsertTable();
        JsonUrlConnect jsonUrlConnect = new JsonUrlConnect();
        long checkTenMin = System.currentTimeMillis();
        long checkOneDay = System.currentTimeMillis();
        boolean initialize = true;
        boolean closeSignal = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ip Address:");
        Datasource.setIpAddress(scanner.next());
        scanner.nextLine();
        System.out.println("Database Name:");
        Datasource.setDatabaseName(scanner.next());
        scanner.nextLine();
        System.out.println("Username:");
        Datasource.setUsername(scanner.next());
        scanner.nextLine();
        System.out.println("Password:");
        Datasource.setPassword(scanner.next());
        scanner.close();


        if (!datasource.dbConnect()) {
            System.out.println("Fail to connected | " + LocalDateTime.now());
        } else {
            if (!datasource.statementOpen()) {
                System.out.println("Fail to open statement | " + LocalDateTime.now());
            } else {

                while (true) {
                    if (initialize) {
                        datasource.createEarthquakeTable();
                        for (int i = 0; i < JsonStoring.locationName.length; i++) {
                            datasource.createDnHForecastTable(JsonStoring.locationName[i]);
                            datasource.createCurrentlyForecastTable(JsonStoring.locationName[i]);
                            datasource.create30DaysForecastTable(JsonStoring.locationName[i]);
                            System.out.println("Table of : " + JsonStoring.locationName[i] + " checked or created | " + LocalDateTime.now());
                        }
                        initialize = false;
                    }

                    datasource.earthquakeReload();
                    JsonStoring.updateEarthquakeArray(jsonUrlConnect);
                    insertTable.insertEarthquakeData(datasource, JsonStoring.earthquake);

                    if (System.currentTimeMillis() >= checkTenMin) {
                        checkTenMin = TimeProcessing.tenMinuteTimer();
                        System.out.println(checkTenMin);
                        for (int i = 0; i < JsonStoring.locationName.length; i++) {
                            datasource.TenMinReload(JsonStoring.locationName[i]);
                        }

                        JsonStoring.updateCuJSONArray(jsonUrlConnect);
                        JsonStoring.updateAPJSONArray(jsonUrlConnect);
                        JsonStoring.updateCuArray();
                        JsonStoring.updateAPArray();

                        for (int i = 0; i < JsonStoring.locationName.length; i++) {
                            insertTable.currentlyWeather(datasource, JsonStoring.locationName[i], JsonStoring.jsongetCuArray[i]);
                            insertTable.insertCurrentAirPollution(datasource, JsonStoring.locationName[i], JsonStoring.jsongetAPArray[i]);
                            System.out.println("Inserted " + JsonStoring.locationName[i] + " Ten Min data | " + LocalDateTime.now());
                        }

                    }

                    if (System.currentTimeMillis() >= checkOneDay) {
                        checkOneDay = TimeProcessing.oneDayTimer();
                        System.out.println(checkOneDay);
                        for (int i = 0; i < JsonStoring.locationName.length; i++) {
                            datasource.OneDayReload(JsonStoring.locationName[i]);
                        }

                        JsonStoring.updateDnHJSONArray(jsonUrlConnect);
                        JsonStoring.update30DJSONArray(jsonUrlConnect);
                        JsonStoring.updateDnHArray();
                        JsonStoring.update30DArray();

                        for (int i = 0; i < JsonStoring.locationName.length; i++) {
                            insertTable.insertDnHWeatherForecast(datasource, JsonStoring.locationName[i], JsonStoring.jsongetArray[i]);
                            insertTable.days30WeatherForecast(datasource, JsonStoring.locationName[i], JsonStoring.jsonget30DArray[i]);
                            System.out.println("Inserted " + JsonStoring.locationName[i] + " One Day data | " + LocalDateTime.now());
                        }

                    }

                    if (closeSignal) {
                        break;
                    }
                }

                datasource.statementClose();
                datasource.dbDisconnect();

            }
        }
    }
}
