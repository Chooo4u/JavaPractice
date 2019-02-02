package DataFlow;

public class StringMethod {
    public static void main(String [] args){
        String original = "abcde";
        for(int i = 0; i < original.length(); i++) {
            System.out.println("The character at index " + i + " is " + original.charAt(i));
        }
        System.out.println("The letter \"a\" is at index " + original.indexOf("a"));
        System.out.println("The letter \"b\" is at index " + original.indexOf("b"));
        System.out.println("The letter \"A\" is at index " + original.indexOf("A"));

        String capOrigin = original.toUpperCase();
        System.out.println(capOrigin);
        System.out.println("The letter \"A\" is at index " + capOrigin.indexOf("A"));

        System.out.println("example".substring(0,4));
        System.out.println("example".substring(4)); // to the end
    }
}
