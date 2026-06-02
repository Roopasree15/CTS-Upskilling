public class PatternSwitch {

    static void check(Object obj) {
        switch (obj) {
            case Integer i ->
                    System.out.println("Integer: " + i);

            case String s ->
                    System.out.println("String: " + s);

            case Double d ->
                    System.out.println("Double: " + d);

            default ->
                    System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {
        check(100);
        check("Hello");
        check(10.5);
    }
}