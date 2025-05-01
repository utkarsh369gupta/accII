import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int candidate = -1;
        for(int i = 0; i < n; i++){
            boolean isCandidate = true;
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    isCandidate = false;
                    break;
                }
            }
            if(isCandidate){
                candidate = i;
                break;
            }
        }
        
        if(candidate == -1){
            System.out.println("No Celebrity");
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(i != candidate && arr[i][candidate] == 0){
                System.out.println("No Celelbrity");
                return;
            }
        }
        
        System.out.println(candidate);
    }
}
