import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int box = score.length / m;
        int[] temp = new int[m];
        Arrays.sort(score);
        int count = 0;
        if(score.length % m == 0){
            for(int i=0; i < box; i++){
                for(int j=0; j < m; j++){
                    temp[j] = score[count];
                    count++;
                }
                answer += temp[0] * m;
            }
        } else {
            count = score.length-1;
            for(int i=0; i < box; i++){
                for(int j=0; j < m; j++){
                    temp[j] = score[count];
                    count--;
                }
                answer += temp[temp.length-1] * m;
            }
        }
        return answer;
    }
}