
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
        
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        if (this.amountOfNumbers == 0){
            return 0;
        } else {
            return (double) this.sum / this.amountOfNumbers;
        }
    }
    
    
    
    
    
    
    
}
