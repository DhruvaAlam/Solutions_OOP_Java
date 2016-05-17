
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("First: ");
        int start = Integer.parseInt(reader.nextLine());
        int i = start + 1;
        
        System.out.println("Second: ");
        int end = Integer.parseInt(reader.nextLine());
                
        
        while (i <= end){
            start = start + i;
            i++     ;               
        }
        System.out.println("The sum: " + start);
    }
}
