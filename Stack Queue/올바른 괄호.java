import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++){
            // System.out.println((s.charAt(i)));
            if(s.charAt(i)=='('){
                stack.push('(');
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
            
        }
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}
