public class Parameters {
    public static void main(String[] args) {
        power2(29);
        power2(7);

        power(4, 10); // call for the first power(int,int)
        power(3.2,9); // call for the second power(double,int) -- overloading
        power(4); // call for the third power(int) for the default base of 2.
    }

    public static void power2(int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= 2;
        }
        System.out.println("2 to the " + exp + " = " + result);
    }

    public static void power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base +" to the " + exp + " = " + result);
    }

    public static void power(double base, int exp) {
        double result = 1.0;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base + " to the " + exp + " = " + result);
    }

    public static void power(int exp) {
        power(2, exp);
    }


}
