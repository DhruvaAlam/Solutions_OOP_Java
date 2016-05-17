
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double leaper = 0;
        
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        double div4 = (double) year % 4;
        double div100 = (double) year % 100;
        double div400 = (double) year % 400;
        
        if(div100 == leaper && div400 == leaper){
            System.out.println("The year is a leap year.");
        } else if (div4 == leaper && div100 != leaper) {
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
            

    }
}
