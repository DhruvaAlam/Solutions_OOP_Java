
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        int sum = firstNum + secondNum;
        System.out.print("Sum of the numbers: " + sum);
    }
}
