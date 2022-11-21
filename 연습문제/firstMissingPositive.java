import java.util.*;


class Solution {
    public int solution(int[] A) {
         //HashSet은 Set 인터페이스의 구현 클래스입니다. 
         //그렇기에 Set의 성질을 그대로 상속받습니다. Set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있습니다
        Set<Integer> set = new HashSet<>();
        int result = 1;
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
          //양수면
            if(A[i]>0){
                for(int j=0; j<A.length; j++){
                   //A[j]포함하면 반복만 바로나감
                    if(set.contains(A[j])) continue;
                   //안포함하면 set에 add
                    if(result == A[j]){ 
                        set.add(A[j]);
                        result++;
                    } else break; // 아니면 바로 return
                }
                break; // 음수면 바로 값 1 return
            }
        }
        //System.out.println(A);
        return result;
    }
}
