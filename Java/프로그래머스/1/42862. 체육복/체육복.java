import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n-lost.length;
        for(int x=0; x < lost.length; x++){
            int a = lost[x];
            for(int i=0; i < reserve.length; i++){
                if(a == reserve[i]){
                    answer+=1;
                    reserve[i] = 10000;
                    lost[x] = 10003;
                }
            }
        }
        for(int num : lost){
            for(int i=0; i < reserve.length; i++){
                int temp = Math.abs(num - reserve[i]);
                if(temp == 1 || temp == 0){
                    answer+=1;
                    reserve[i] = 10000;
                    break;
                }
            }
        }
        return answer;
    }
}