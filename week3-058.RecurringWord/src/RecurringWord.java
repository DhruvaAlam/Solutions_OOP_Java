
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String toAdd = reader.nextLine();

        while (!words.contains(toAdd)) {
            words.add(toAdd);
            System.out.println("Type a word: ");
            toAdd = reader.nextLine();
        }
        
        if(words.contains(toAdd)){
            System.out.println("You gave the word " + toAdd + " twice");   
        }
    }

}

