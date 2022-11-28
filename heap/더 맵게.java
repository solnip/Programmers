import java.util.*;
// 우선순위큐

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();
        
        for(int aScoville : scoville){
            heap.offer(aScoville); // queue에 데이터를 집어넣음
        }
        
        while(heap.peek() <= K){ //queue의 맨 앞의 데이터를 확인합니다.
            if(heap.size() == 1){
                return -1;
            }
            int a = heap.poll(); //queue에 있는 맨 앞에 있는 데이터를 뽑습니다.
            int b = heap.poll(); 
            
            int result = a + (b * 2);
            
            heap.offer(result);
            answer ++;
        }
        return answer;
    }
}
