
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        
        System.out.println("Type the second word: ");
        String search = reader.nextLine();
        
        int index = word.indexOf(search);
        
        if (index >= 0){
            System.out.println("The word '" + search + "' is found in the '" + word + "'");
        }else {
            System.out.println("The word '" + search + "' is not found in the '" + word + "'");
        }
            
    }
}
