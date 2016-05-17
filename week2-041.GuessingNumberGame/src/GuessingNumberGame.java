
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int numGuess = 1;
        
        while (guess != numberDrawn){
            if (guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + numGuess);
            } else{
                System.out.println("The number is lesser, guesses made: " + numGuess);
            }
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            numGuess++;
            
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
