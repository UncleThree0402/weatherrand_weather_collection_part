import database.WeatherDataRepository;
import formatter.TimeProcessing;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static String ipAddress;
    private static String databaseName;
    private static String username;
    private static String password;
    private WeatherDataRepository mWeatherDataRepository;

    public static void main(String[] args) {
        WeatherDataRepository mWeatherDataRepository;
        long checkTenMin = System.currentTimeMillis();
        long checkOneDay = System.currentTimeMillis();
        long checkFiveMin = System.currentTimeMillis();
        boolean initialize = true;
        boolean closeSignal = false;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ip Address:");
        ipAddress = scanner.next();
        scanner.nextLine();
        System.out.println("Database Name:");
        databaseName = scanner.next();
        scanner.nextLine();
        System.out.println("Username:");
        username = scanner.next();
        scanner.nextLine();
        System.out.println("Password:");
        password = scanner.next();
        scanner.close();

        mWeatherDataRepository = new WeatherDataRepository(ipAddress, databaseName, username, password);


        while (true) {

            if (System.currentTimeMillis() >= checkFiveMin) {
                checkFiveMin = TimeProcessing.fiveMinuteTimer();
                mWeatherDataRepository.updateFiveMin();
            }

            if (System.currentTimeMillis() >= checkTenMin) {
                checkTenMin = TimeProcessing.tenMinuteTimer();
                System.out.println(checkTenMin);
                mWeatherDataRepository.updateTenMin();
                System.out.println("Inserted Ten Min data | " + LocalDateTime.now());


            }

            if (System.currentTimeMillis() >= checkOneDay) {
                checkOneDay = TimeProcessing.oneDayTimer();
                System.out.println(checkOneDay);
                mWeatherDataRepository.updateOneDay();
                System.out.println("Inserted One Day data | " + LocalDateTime.now());
            }

        }


    }

}

