
public class StringComparison {

	public static void main(String[] args) throws InterruptedException {

        // Task 1: StringBuilder - Append 1,000 strings
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            builder.append("Java");
        }

        System.out.println("StringBuilder length: " + builder.length());

        // Task 2: StringBuffer - Append 1,000 strings
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 1000; i++) {
            buffer.append("Java");
        }

        System.out.println("StringBuffer length: " + buffer.length());


        // Task 5: Two threads using the same StringBuilder
        StringBuilder sharedBuilder = new StringBuilder();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuilder.append("B");
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\nMultithreaded StringBuilder:");
        System.out.println("Expected length: 2000");
        System.out.println("Actual length: " + sharedBuilder.length());


        // Task 6: Two threads using the same StringBuffer
        StringBuffer sharedBuffer = new StringBuffer();

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuffer.append("A");
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuffer.append("B");
            }
        });

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("\nMultithreaded StringBuffer:");
        System.out.println("Expected length: 2000");
        System.out.println("Actual length: " + sharedBuffer.length());
    }
}
