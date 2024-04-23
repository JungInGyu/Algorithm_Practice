class Solution {
    public long solution(int price, int money, int count) {
        long temp = 0;
        for(int i=1; i <= count; i++){
            temp += price * i;
        }
        long answer = (money < temp) ? Math.abs(money-temp) : 0;

        return answer;
    }
}