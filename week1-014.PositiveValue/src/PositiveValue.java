
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int zero = 0;

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        if (num > zero) {
            System.out.println("The number is positive.");
        } else  {
                    System.out.println("The number is not positive.");
        }
        }
    }



