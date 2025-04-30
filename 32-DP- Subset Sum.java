import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean result = checktarget(n-1, target, arr);
        if(result)
            System.out.println("yes");
        else{
            System.out.println("no");
        }
    }
    private static boolean checktarget(int i, int target, int[] arr){
        // base case
        if(target == 0) return true;
        
        if(i == 0){
            if(arr[i] == target) return true;
            return false;
        }
        
        boolean take = false;
        if(target >= arr[i]){
            take = checktarget(i-1, target - arr[i], arr);
        }
        boolean nottake = checktarget(i-1, target, arr);
        
        return take || nottake;
    }
}
