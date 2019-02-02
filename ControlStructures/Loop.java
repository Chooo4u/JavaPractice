package ControlStructures;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        forloop();
        nestloop();
        whileloop();
    }

    public static void forloop(){
        for(int i = 10; i >= 0; i-= 2){
            System.out.println("The current value of i is " + i);
        }
    }
    /*
    for (initialization; test; update) {
    body
    }
     */
    public static void nestloop(){
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner j = " + j);
            }
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("0 ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void whileloop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        String answer = input.next();
        while (answer.equals("hi")) {
            System.out.println("hello");
            answer = input.next();
        }
        System.out.println("Goodbye");

        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number to get the sum or 0 to end it: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);

        String answer2 = "";
        while (!answer2.equals("yes") && !answer2.equals("no")) {
            System.out.println("Enter yes or no: ");
            answer2 = input.next();
        }
        System.out.println("Thank you!");


    }
}
