import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int getPokemonCnt = nums.length/2;
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int num : nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        //System.out.println(hash.size());
        if (getPokemonCnt>hash.size()){
            answer = hash.size();
        }else{
            answer = getPokemonCnt;
        }
        return answer;
    }
}
