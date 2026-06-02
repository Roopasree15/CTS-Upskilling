public class VirtualThread {

    public static void main(String[] args)
            throws Exception {

        long start =
                System.currentTimeMillis();

        for(int i=0;i<100000;i++) {

            Thread.startVirtualThread(() -> {
                System.out.println(
                        Thread.currentThread());
            });
        }

        long end =
                System.currentTimeMillis();

        System.out.println(
                "Time : " + (end-start));
    }
}