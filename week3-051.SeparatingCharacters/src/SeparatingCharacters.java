
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type yor name: ");
        String name = reader.nextLine();
        
        int length = name.length() -1;
        int i = 0;
        int list = 1;
        
        while (i <= length){
            System.out.println(list + ". character: " + name.charAt(i));
            i++;
            list++;
        }
                
    }
}
