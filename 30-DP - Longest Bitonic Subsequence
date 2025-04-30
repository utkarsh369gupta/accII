import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i ++){
                arr[i] = sc.nextInt();
            }
            int result = maxlenbitonic(n, arr);
            System.out.println(result);
        }
    }
    private static int maxlenbitonic(int n, int[] arr){
        int[] inc = lis(arr);
        int[] reversed = Arrays.copyOf(arr, arr.length);
        reverse(reversed);
        int[] dec = lis(reversed);
        reverse(dec);

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(inc[i] + dec[i]-1, max);
        }
        return max;
    }
    private static int[] lis(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i] && result[j] + 1 > result[i]){
                    result[i] = result[j] + 1;
                }
            }
        }
        return result;
    }
    private static void reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i-1];
            arr[n-i-1] = temp;
        }
    }
}
