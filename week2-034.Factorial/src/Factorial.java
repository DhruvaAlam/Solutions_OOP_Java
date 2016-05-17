import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        
        int result = 1;
                
        if (factorial == 0){
            System.out.println("Factorial is " + result);
        } else {
            int i = 1;
                        
            while (i <= factorial) {
                result = result * i;
                i++;
                
            }
            System.out.println("Factorial is " + result);
                    
            
        }
        
        
    }
}
