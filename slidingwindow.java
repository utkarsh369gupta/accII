import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= k-1) list.add(arr[dq.peekFirst()]);
        }
        for(int i: list){
            System.out.print(i + " ");
        }
    }
}
