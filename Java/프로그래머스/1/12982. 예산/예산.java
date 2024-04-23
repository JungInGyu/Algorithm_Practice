import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for(int num : d){
            answer+= num;
            if(answer == budget){
                count++;
                break;
            } else if(answer > budget){
                answer-=num;
                break;
            }
            count++;
        }
        return count;
    }
}