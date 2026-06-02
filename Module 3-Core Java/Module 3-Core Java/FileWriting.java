import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            sc.close();
        }
    }
}