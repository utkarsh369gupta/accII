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
        int result = lis(0, -1, arr);
        System.out.println(result);
    }
    private static int lis(int i, int prev, int[] arr){
        // base case
        if(i == arr.length){
            return 0;
        }
        
        int take = Integer.MIN_VALUE;
        if(prev == -1 || prev < arr[i]){
            take = 1 + lis(i+1, arr[i], arr);
        }
        int nottake = lis(i+1, prev, arr);
        
        return Math.max(take, nottake);
    }
}
