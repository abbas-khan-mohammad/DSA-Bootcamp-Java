package LECTURES.Arrays;
import java.util.*;
public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n]; 
        for(int i=0; i<prices.length; i++){
            prices[i] = sc.nextInt();
        }sc.close();

        int least = Integer.MAX_VALUE;
        int profitIfSoldToday = 0;
        int overallProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<least){
                least = prices[i];
            }
            profitIfSoldToday = prices[i] - least;
            if(profitIfSoldToday > overallProfit){
                overallProfit = profitIfSoldToday;
            }
        }System.out.println("Profit = "+overallProfit);
    }
}
