import java.io.*;
import java.util.*; 
class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
            String S = sc.nextLine().trim();
            Solution sol = new Solution();
            if(sol.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
    }
}
class Solution {
    public boolean valid(String s) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        
        set.add('(');
        set.add('[');
        set.add('{');
        
        for(int i =0; i<s.length();i++){
            char curr = s.charAt(i);
            if(set.contains(curr)){
                st.push(curr);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                else if(st.peek() == '(' && curr == ')'){
                        st.pop();
                }
                else if(st.peek() == '[' && curr == ']'){
                    st.pop();
                }
                else if(st.peek() == '{' && curr == '}'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
