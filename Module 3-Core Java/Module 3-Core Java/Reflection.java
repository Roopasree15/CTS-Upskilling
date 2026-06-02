import java.lang.reflect.Method;

public class Reflection {

    public void greet() {
        System.out.println("Hello Reflection");
    }

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Reflection");

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Method method =
                cls.getDeclaredMethod("greet");

        method.invoke(obj);
    }
}