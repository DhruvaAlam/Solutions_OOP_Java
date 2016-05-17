import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
         this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        int num = random.nextInt(this.numberOfSides + 1);
        while (num == 0){
            num = random.nextInt(this.numberOfSides + 1);
        }
        return num;
    }
}
