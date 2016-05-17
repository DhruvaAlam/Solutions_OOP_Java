
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 

    public static int sum(ArrayList<Double> list) {
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

    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        int length = list.size();

        if (length > 1) {
            double avg = average(list);

            ArrayList<Double> listToSum = new ArrayList<Double>();
            double num = 0;
            for (int number : list) {
                num = Math.pow(((double) number - avg), 2);
                listToSum.add(num);
            }
            variance = (double) sum (listToSum);
            variance = variance / (length - 1);
            
        }
        // write code here
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
