class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long num = (a > b) ? b : a;
        long num2 = (a < b) ? b : a;
        for(long i=num; i <= num2; i++){
            answer+=i;
        }
        return answer;
    }
}