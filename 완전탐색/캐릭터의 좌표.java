import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int v = 0;
        int h = 0; 
        for (String keyArr: keyinput){
            System.out.println(keyArr);
            System.out.println("v:"+v);
            System.out.println("h:"+h);
            if(keyArr.equals("up")){
                h++;
                if(Math.abs(h)>board[1]/2){
                    h--;
                }
            }else if(keyArr.equals("down")){
                h--;
                if(Math.abs(h)>board[1]/2){
                    h++;
                }
            }else if(keyArr.equals("left")){
                v--;
                if(Math.abs(v)>board[0]/2){
                    v++;
                }
            }else if(keyArr.equals("right")){
                v++;
                if(Math.abs(v)>board[0]/2){
                    v--;
                }
            }
        }
        answer[0] = v;
        answer[1] = h;
        return answer;
    }
}
