
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String user2 = "emily";
        
        String pass1 = "mightyducks";
        String pass2 = "cat";
        
        System.out.println ("Type your username: ");
        String userName = reader.nextLine();
        
        System.out.println("Type your password: ");
        String passWord = reader.nextLine();
        
        if ((userName.equals(user1) && (passWord.equals(pass1))) || (userName.equals(user2) && (passWord.equals(pass2))) ) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println ("Your username or password was invalid!");
        }
            
                

    }
}
