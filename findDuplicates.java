import java.io.*;
import java.util.*;
class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int sum =0;
        for(int i =0; i< n; i++){
            sum += arr[i];
        }
        
        for(int i =0; i<n-1; i++){
            sum -= (i+1);
        }
        
        return sum;
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
