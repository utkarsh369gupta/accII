import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = fibonaaci(n);
        System.out.println(result);
    }
    private static int fibonaaci(int n){
        if(n == 0 || n == 1) return n;
        
        return fibonaaci(n-1) + fibonaaci(n-2);
    }
}
