import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        playGame(number);

        // Guess Number
        // 47
        // Your guess is too large
        // Guess
        // 46
        // You guessed the right number: 
    }
    
    public static void playGame(int number){
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        while(true){
            System.out.println("Guess Number");
            int guess = input.nextInt();
            if(guess<number){
                System.out.println("Your guess is too small");
            }
            else if(guess>number){
                System.out.println("Your guess is too large");
            }
            else{
                System.out.printf("You guessed the right number: %d in %d tries.",number,cnt+1);
                input.close();
                break;
            }
            cnt++;
        }
    }
}