import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hash = new HashMap<>();
         
        for(String part : participant){
             hash.put(part,hash.getOrDefault(part,0) + 1); 
             //System.out.println("hash:"+hash);
        }
        for(String comp : completion){
             hash.put(comp,hash.get(comp) - 1); 
             //System.out.println("hash:"+hash);
        }
        
        for(String key : hash.keySet()){
            //System.out.println(hash);
            if(hash.get(key) != 0){
                return key;

            }
        }
        return answer;
    }
}
