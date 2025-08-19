import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int BinaryNum = Integer.bitCount(n);
        int count = 1;
        while(true){
            if(Integer.bitCount(n+count) == BinaryNum){
                answer = n + count;
                break;
            }
            count++;
        }
        return answer;
    }
}