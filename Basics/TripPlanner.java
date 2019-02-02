package Basics;

import java.util.Scanner;

public class TripPlanner {
    public static void main (String[] args) {

        Greeting();
        TimeBudget();
        TimeDifference();
        CountryArea();
        System.out.println("Thank you for using Vacation Planner.");
    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("Nice to meet you " + name + ", where are you traveling to?");
        String location = input.next();
        System.out.println("Great! " + location + " sounds like a good trip.");
        System.out.println("***********************");
        System.out.println("");

    }

    public static void TimeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling?");
        int days = input.nextInt();
        System.out.println("How much money, in USD are you planning to spend on your trip?");
        double money = input.nextDouble();
        System.out.println("What is the 3 letter currency symbol (in capital) for your travel destination?");
        String symbol = input.next();
        System.out.println("How many " + symbol + " are there in 1 USD?");
        double rate = input.nextDouble();

        String line = input.nextLine();
        System.out.println("If you are traveling for " + days + " days that is the same as " + days*24 + " hours or " + days*24*60 + " minutes.");
        System.out.println(line);
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + money/days + " USD.");
        System.out.println(line);
        System.out.println("Your total budget in " + symbol + " is " + money*rate + " " + symbol + ", which per day is " + money*rate/days + " " + symbol);
        System.out.println("***********************");
        System.out.println("");
    }

    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int diff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + diff%24 + ":00 in your travel destinaton and when it is noon at home it will be " + (diff+12)%24 + ":00.");
        System.out.println("***********************");
        System.out.println("");
    }

    public static void CountryArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the square area of your destination country in km2?");
        double area = input.nextDouble();
        System.out.println("In miles2 that is " + area*0.3861);
        System.out.println("***********************");
        System.out.println("");
    }

}
