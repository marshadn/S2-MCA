import java.util.*;

public class StringManipulations {
    public static void main(String[] args) {
        // String s = "Hello World!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("length of string:" + s.length());
        System.out.println("character at 0:" + s.charAt(0));
        System.out.println("character at 7:" + s.charAt(7));
        System.out.println("substring from 0 to 5:" + s.substring(0, 5));
        System.out.println("substring at 6:" + s.substring(6));
        System.out.println("lowercase:" + s.toLowerCase());
        System.out.println("uppercase:" + s.toUpperCase());
        System.out.println("replace H with k:" + s.replace("H", "k"));
        System.out.println("Ist index of o:" + s.indexOf('o'));
        System.out.println("concatenation:" + s.concat(" How are you"));

    }
}
