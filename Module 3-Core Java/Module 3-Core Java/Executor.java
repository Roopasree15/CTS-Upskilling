import java.util.concurrent.*;

public class Executor{

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> 10;
        Callable<Integer> task2 = () -> 20;
        Callable<Integer> task3 = () -> 30;

        Future<Integer> f1 =
                executor.submit(task1);

        Future<Integer> f2 =
                executor.submit(task2);

        Future<Integer> f3 =
                executor.submit(task3);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}