
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top 10 by Points: ");
        NHLStatistics.sortByGoals();  
        NHLStatistics.top(10);
        
        
        System.out.println("Top 25 by number of penalties: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Sidney Crosby stats: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Stats for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Players in the Anaheim Ducks by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
        
    }
}
