class Solution {
    public int solution(int n) {
        int answer = fibo(n, 1 , 0);
        return answer;
    }
    public int fibo(int num, long targetX, long targetY) {
        long targetNumber = 0;
        targetNumber = (targetX + targetY) % 1234567;
        targetY = targetX;
        targetX = targetNumber;
        num--;
        if(num > 1){
           return fibo(num,targetX,targetY);
        } 
        return (int) targetNumber;
    }
}