import java.io.*;
import java.util.*;
class Solution {
    public int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while(slow != fast);
            
        fast = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}

public class Main {
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i =0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    Solution sol = new Solution();
	    System.out.println(sol.findDuplicate(arr));
		
	}
}
