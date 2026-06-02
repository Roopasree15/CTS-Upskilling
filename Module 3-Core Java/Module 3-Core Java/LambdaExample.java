import java.util.*;
public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mohan");
        names.add("Arun");
        names.add("Priya");
        names.add("Kiran");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted List:");
        for(String name : names) {
            System.out.println(name);
        }
    }
}