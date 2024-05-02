import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        for(int i=1; i <= number; i++){
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    count+=2;
                }
                if(j*j == i){
                    count--;
                }
            }
            if(count > limit){
                count = power;
            }
            answer += count;
            count = 0;
        }
        return answer;
    }
}