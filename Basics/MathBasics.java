package Basics;

public class MathBasics {
    public static void main(String[] args){
        double x = 10;
        int y = 3;
        System.out.println("x + y = " + (x + y ));
        System.out.println("x - y = " + (x - y ));
        System.out.println("x * y = " + (x * y ));
        System.out.println("x / y = " + (x / y ));

        x++;
        y *= 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x += y;
        System.out.println("x = " + x);

        System.out.println( 2.0 * 7 / 2 );
        System.out.println( 7 / 2 * 2.0 );

        System.out.println((int)(10/4.0));
        System.out.println((int)10/4.0); // need parenthesis if calculated
        System.out.println((double)10); // np need parenthesis
    }
}
