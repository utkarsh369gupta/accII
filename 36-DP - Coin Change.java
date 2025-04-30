import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int target = sc.nextInt();
        int result = minCoins(n-1, target, arr);
        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }
    private static int minCoins(int i, int target, int[] arr){
        //base case
        if(target == 0){
            return 0;
        }
        if(i == 0){
            if(target%arr[i] == 0){
                return target/arr[i];
            }else{
                return Integer.MAX_VALUE;
            }
        }
        
        int take = Integer.MAX_VALUE;
        if(target >= arr[i]){
            int subResult = minCoins(i, target - arr[i], arr);
            if(subResult != Integer.MAX_VALUE){
                take = 1 + subResult;
            }
        }
        int nottake = minCoins(i-1, target, arr);
        
        return Math.min(take, nottake);
    }
}
