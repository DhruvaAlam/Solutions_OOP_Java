import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random pass;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        pass = new Random();
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        //ArrayList chars = new ArrayList(this.length);
        String result = "";
        
        for (int i = 0; i < this.length; ++i){
            int password = pass.nextInt(25);
            result = result + alphabet.charAt(password);
                    //chars.add(alphabet.charAt(password), i);
            
        }
        return result;
    }
}
