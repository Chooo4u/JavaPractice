public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");
        String a = "";
        a += "0";
        if (a == "0") {
            System.out.println("a is 0!");
        } else if (a == "1") {
            System.out.println("a is 1!");
        } else if (a == "a") {
            System.out.println("a is a!");
        } else {
            System.out.println("a is something else!");
        }

        int c = 5;
        for (int i = 2; i <= c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Tricky!" + j + i);
            }
        }
    }
}