import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called \"Odds and Evens\".");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String choice = input.next();
        if (choice.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("-----------------------------------");

        System.out.println("How many \"fingers\" do you put out?");
        int user = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer +" \"fingers\".");
        System.out.println("-----------------------------------");

        int sum = user + computer;
        boolean oddOrEven = sum % 2 == 0;
        System.out.println(user + " + " + computer + " = " + sum);
        if (oddOrEven) {
            System.out.println(sum + " is ... even!");
            if (choice.equals("E")) {
                System.out.println(name + " wins!");
            } else {
                System.out.println("The computer wins!");
            }
        } else {
            System.out.println(sum + " is ...odd!");
            if (choice.equals("O")) {
                System.out.println(name + " wins!");
            } else {
                System.out.println("The computer wins!");
            }
        }
        System.out.println("-----------------------------------");

    }
}
