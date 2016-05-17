
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        
        int ageSum = age1 + age2;
        
        System.out.println(firstName + " and " + secondName + " are " + ageSum + " years old in total.");
        
        
    }
}
