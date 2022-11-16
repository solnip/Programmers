import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        
        stack.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                 stack.push(arr[i]);
            } 
        }
        //삽질한부분 선언부분을 놓치지 말자 ^-^;;
        int[] answer = new int[stack.size()];
        //System.out.println(stack.size()-1);

        
        for(int i=stack.size()-1; i>=0; i--){
            answer[i]= stack.pop();
        }

        return answer;
    }
}
