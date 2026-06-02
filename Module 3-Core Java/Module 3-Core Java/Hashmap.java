import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Abi");
        map.put(102, "John");
        map.put(103, "Priya");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.println("Name: " + map.get(id));
        sc.close();
    }
}