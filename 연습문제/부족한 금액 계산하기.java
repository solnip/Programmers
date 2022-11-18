class Solution {
    public long solution(int price, int money, int count) {
        //return 값의 데이터 형식이 long 이므로 cnt도 long으로 선언해야함
        long cnt = 0;
        for (int i =1; i<=count; i++){
            cnt = cnt + price * i;
        }

        long answer = -1;
        answer = cnt > money ? cnt - money : 0 ; 
        return answer;
    }
}
