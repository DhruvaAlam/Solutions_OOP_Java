
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int majorit = 18;
        
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >= majorit) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }

        // Type your program here 
    }
}
