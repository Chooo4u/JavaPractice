package Basics;

public class StringsAndVariables {
    public static final double PI = 3.14;
    public static final int MAX_SPEED = 80;
    public static final int DAYS_IN_WEEK = 7;

    public static void main (String[] args) {
        method1();
        method2();
        method3();
        System.out.println("Done with main method");
        Variables();
        int calendarRows = DAYS_IN_WEEK;
        System.out.println(calendarRows);

    }
    public static void method1() {
        int x = 10;
        System.out.println("\"Quotes\""+x);
    }
    public static void method2() {
        System.out.println("Slashes \\//");
    }
    public static void method3() {
        System.out.println("How '\"confounding' \"\\\" it is!");
    }


    public static void Variables () {
        String line = "This is the chorus";
        System.out.println(line);
        verse();
        System.out.println(line);
    }
    public static void verse() {
        String line = "This is my verse";
        System.out.println(line);
    }
}