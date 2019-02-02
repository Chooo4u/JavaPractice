package ControlStructures;

import java.util.Scanner;

public class Logic {
    public static void main (String[] args){
        String name = "John Doe";
        System.out.println(name == "John Doe");
        System.out.println("John Doe" == "John Doe");
        System.out.println("john doe" == "John Doe");
        System.out.println(name.equals("John"));
        System.out.println(name.equals("John Doe"));
        /*
        Java中String类型具有一个equals的方法可以用于判断两种字符串是否相等，
        但是这种相等又与运算符==所判断的“相等”有所不同，
        String的equals函数只要两个字符串“看起来”相等，就可以返回true，
        “看起来”相等意思指的是，当两个字符串对象所存放的内容相同时，不需要存放的内存地址相同，
        但是==判断则只有当判断的两个变量所使用的内存地址为相同时才返回true。
        例如有两个长得一模一样的双胞胎A,B，若使用A==B来判断会返回false，使用A.equals(B)则会返回true。
         */

        System.out.println(name.equalsIgnoreCase("john doe"));
        System.out.println(name.startsWith("Joh"));
        System.out.println(name.endsWith("Doe"));
        System.out.println(name.contains("h"));

        ifstatement();
    }
    public static void ifstatement() {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your overall grade percentage?");
        int grade = input.nextInt();

        if (grade > 60) {
            System.out.println("Admitted!");
        } else if (grade > 40){
            System.out.println("You have been wait listed.");
        } else{
            System.out.println("Sorry!");
        }

        System.out.println("Does Player1 choose rock, paper or scissors?");
        String P1 = input.next();
        System.out.println("Does Player2 choose rock, paper or scissors?");
        String P2 = input.next();

        if ( (P1.equals("rock") && P2.equals("scissors")) || (P1.equals("scissors") && P2.equals("paper")) || (P1.equals("paper") && P2.equals("rock"))) {
            System.out.println("Player 1 wins.");
        } else if (P1.equals(P2) ) {
            System.out.println("Tie!");
        } else{
            System.out.println("Player 2 wins");
        }
    }
}
