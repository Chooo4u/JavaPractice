package DataFlow;

import Basics.MathBasics;

public class MathClass {

    public static void main(String[] args) {
        // c = square root of (a^2 + b^2)
        int a = 5;
        int b = 10;
        double asq = Math.pow(a,2);
        double bsq = Math.pow(b,2);
        double c = Math.sqrt(asq + bsq);

        System.out.println("c = " + c);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(3.99));

        System.out.println(Math.random());
        System.out.println(Math.random()*10);
    }
}
