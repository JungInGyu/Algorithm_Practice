import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 4;
        while(cnt <= n){
            int temp = 0;
            for(int i = 1; i <= cnt; i++){
                temp += cnt % i == 0 ? 1 : 0;
            }
            answer += (temp >= 3) ? 1 : 0;
            cnt++;
        }
        return answer;
    }
}