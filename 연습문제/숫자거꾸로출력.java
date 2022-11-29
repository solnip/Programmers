class Solution {
    public void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (N % 10 < 10) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
