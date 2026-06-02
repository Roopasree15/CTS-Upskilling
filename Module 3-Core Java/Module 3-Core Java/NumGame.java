import java.util.*;
public class NumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guess = 0;
        while(guess != randomNumber) {
            System.out.println("Guess a number between 1 and 100:");
            guess = sc.nextInt();
            if(guess > randomNumber) {
                System.out.println("Too High!");
            }
            else if(guess < randomNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct! You guessed the number.");
            }
        }
        sc.close();
    }
}