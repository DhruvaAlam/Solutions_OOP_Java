import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int specialNum = -1;
        
        System.out.println("Type number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int totalNum = 0;
        int even = 0;
        int odd = 0;
        
        while (num != specialNum){
            sum = sum + num;
            totalNum++;
            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
                
            System.out.println("Type number: ");
            num = Integer.parseInt(reader.nextLine());
            
             }
        
        sum = sum ++;
        double average = (double)sum / totalNum;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + totalNum);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
