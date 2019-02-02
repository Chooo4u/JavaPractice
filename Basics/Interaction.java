package Basics;

import java.util.Scanner;
public class Interaction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("Hello " + name);
        System.out.println("What's your age?");
        int age = input.nextInt();
        System.out.println("What's your height?");
        double height = input.nextDouble();
        System.out.println(name + " is " + age + " year old and heights " + height + "m");

        String line = input.nextLine();
        System.out.println("Say something:" + line);

    }



}
