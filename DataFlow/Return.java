package DataFlow;

public class Return {

    public static void main(String[] args) {
        int x = 0;
        x = power(2,6);
        System.out.println(x);

        int xx = power(3,4);
        System.out.println(xx);

        System.out.println(power(4,5));

    }

    public static int power(int base, int exp) {
        /*
        We changed the return type in the method header from void to int so that we can return an integer value,
        and as the last statement of the method we used the return statement to return the value we computed.
         */
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}
