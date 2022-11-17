import java.util.*;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<speeds.length; i++){
            double remainTmp = (100-progresses[i])/(double)speeds[i];
            int remain = (int) Math.ceil(remainTmp);
            //System.out.println("remain:"+remain);
            if(!queue.isEmpty()&&queue.peek()<remain){
                answerList.add(queue.size());
                queue.clear();
                
            }
        queue.offer(remain);     
        //System.out.println("queue:"+queue);
        }
        answerList.add(queue.size());
        System.out.println("answerList:"+answerList);
        
        int answer[] = new int[answerList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
