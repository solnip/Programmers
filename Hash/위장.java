import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hash = new HashMap<>();
        //System.out.println(clothes[1][0]);
        for(int i=0; i<clothes.length; i++){
            hash.put(clothes[i][1],hash.getOrDefault(clothes[i][1], 0)+1);
        }
        for(int value : hash.values()){
            answer = answer * (value+1);
        }
        answer = answer-1;
        return answer;
    }
}
