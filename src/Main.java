public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
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

    }
}