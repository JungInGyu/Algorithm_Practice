class Solution {
    public int solution(long num) {
        int answer = 0;
        if (num == 0){
            answer = 0;
            
        }else{
            while (num > 1){            
                num = (num % 2 == 0) ? num/2 : num*3+1;
                answer++;
            }
        }
        if(answer > 499){
                answer = -1;
            }
        
        return answer;
    }
}