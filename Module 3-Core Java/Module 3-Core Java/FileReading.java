import java.io.File;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}