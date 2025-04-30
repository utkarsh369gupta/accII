import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        
        int result = lcs(str, rev);
        System.out.println(result);
    }
    private static int lcs(String str, String rev){
        int n = str.length();
        int[][] dp = new int[n+1][n+1];
        int result = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(str.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                result = Math.max(dp[i][j], result);
            }
        }
        return result;
    }
}
