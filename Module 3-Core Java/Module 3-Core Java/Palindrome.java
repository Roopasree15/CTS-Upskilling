import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}