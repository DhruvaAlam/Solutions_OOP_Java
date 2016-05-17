import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String second = reverse(text);
        if (second.equals(text)){
         return true;   
        }
        
        return false;
    }
    
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int length = text.length() - 1;
        String result = "";
             
        
        while (length >= 0){
            result = result + text.charAt(length);
            length--;
        }
            
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
