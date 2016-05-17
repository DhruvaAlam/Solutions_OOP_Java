
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        int bigger = Math.max(firstNum, secondNum);
        System.out.println("The bigger number of the two numbers given was: " + bigger);
        
    }
}
