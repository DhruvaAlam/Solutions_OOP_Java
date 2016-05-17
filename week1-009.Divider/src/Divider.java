
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print ("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.print ("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        double quotient = (double) firstNum / secondNum;
        
        System.out.println("Division: " + firstNum +  " / " + secondNum + " = " + quotient);
        
        // Implement your program here. Remember to ask the input from user.
    }
}
