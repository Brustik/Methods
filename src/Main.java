public class Main {
    public static void main(String[] args) {
        task1();
        task2();
//        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int year = 2020;
        boolean YearLeap = isYearLeap(year);
        if (YearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является невисокосным");
        }

    }
    
    public static boolean isYearLeap(int year) {
        boolean isYearLeap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //сгуглил, у самого код внизу:)
            isYearLeap = true;
        }
        return isYearLeap;
    }

    //        if (year % 400 == 0 && year % 100 == 0) {
//            isYearLeap = true;
//        } else if (year % 4 == 0 && year % 100 > 0) {
//            isYearLeap = true;
//        } else if (year % 100 == 0) {
//            isYearLeap = false;
//        } else {
//            isYearLeap = false;
//        }


    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = 2022;
        int checkDevice = checkClientDevice(clientOS, clientDeviceYear);
        if (checkDevice == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (checkDevice == 2) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (checkDevice == 3) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int checkClientDevice(int clientOS, int clientDeviceYear) {
        int checkClientDevice;
        int currentYear = 2022;
        if (clientOS == 0 && clientDeviceYear == currentYear) {
            checkClientDevice = 1;
        } else if (clientOS == 0) {
            checkClientDevice = 2;
        } else if (clientDeviceYear == currentYear) {
            checkClientDevice = 3;
        } else {
            checkClientDevice = 4;
        }
        return checkClientDevice;

    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");

    }
}