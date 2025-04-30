import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] profit = new int[n];
        int[] weight = new int[n];
        
        for(int i = 0; i < n; i++){
            profit[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }
        
        int result = maxprofit(n-1, m, profit, weight);
        System.out.println(result);
    }
    private static int maxprofit(int i, int target, int[] profit, int[] weight){
        //base case
        if(target == 0) return 0;
        
        if(i == 0){
            if(target >= weight[i]){
                return profit[i];
            }
            return 0;
        }
        
        int take = 0;
        if(target >= weight[i]){
            take = profit[i] + maxprofit(i-1, target - weight[i], profit, weight);
        }
        int nottake = maxprofit(i-1, target, profit, weight);
        
        return Math.max(take, nottake);
    }
}
