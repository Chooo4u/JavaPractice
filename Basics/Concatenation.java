package Basics;

public class Concatenation {
    public static void main (String[] args) {
        String var1 = "hello";
        String var2 = "world";
        System.out.println(var1 + " " + var2);
        System.out.println(var1 + " " + 123456);
        System.out.println(1 + 2 + "3" + 4 + 5); // from left to right
        System.out.println(1 * 2 + "3" + 4 * 5);
    }
}
