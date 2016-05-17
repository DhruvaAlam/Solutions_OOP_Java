
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int num = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int max = Integer.parseInt(reader.nextLine());
        
        if(num <= max){
            while(num <= max){
                System.out.println(num);
                num++;
            }
        }
        

    }
}
