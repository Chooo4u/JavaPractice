package DataFlow;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5)); // 循环 = n!
        System.out.println(factorialRecursion(5)); //递归

        System.out.println(fibonacci(10));
    }

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursion(n-1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
