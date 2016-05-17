
import java.util.ArrayList;

public class AverageOfNumbers {

   public static int sum(ArrayList<Integer> list) {
        int sumNum = 0;
        
        for (int number: list){
         sumNum = sumNum +  number;   
        }
        
        return sumNum;
    }
     

    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        int length = list.size();
        double avg = (double) sum /  (double) length;
        return avg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}