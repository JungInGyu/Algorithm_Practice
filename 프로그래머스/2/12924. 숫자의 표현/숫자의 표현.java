import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int num = i;
            for (int j = i + 1; j <= n; j++) {
                if (num == n){
                    answer++;
                    break;
                } else if (num > n) {
                    break;
                }
                num += j;
            }
        }
        return answer +1;
    }
}