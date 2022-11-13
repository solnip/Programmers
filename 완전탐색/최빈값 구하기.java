class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arrMax = 0;
        for (int i=0; i<array.length; i++){
            if(array[i]>arrMax){
                arrMax=array[i];
            }
        }
        int[] index = new int[arrMax+1];
        for(int i=0; i<array.length; i++){
            index[array[i]]++;
        }
        
        int max = 0;
        for(int i=0; i<index.length; i++){
            System.out.println("index"+i+"==="+index[i]);
            
            if(index[i]>max){
                max = index[i];
                answer = i;
            }else if(index[i]==max){
                answer = -1;
            }
        }
        return answer;
    }
}
