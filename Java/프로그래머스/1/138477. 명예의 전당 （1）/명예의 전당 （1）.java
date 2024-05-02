import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[k];
        answer[0] = score[0];
        int min = score[0];
        if (k < score.length) {
            for (int j = 0; j < k; j++) {
                temp[j] = score[j];
                if (min > score[j]) {
                    min = score[j];
                }
                answer[j] = min;
            }
            Arrays.sort(temp);
            for (int x = k; x < temp.length; x++) {
                answer[x] = temp[0];
            }
            for (int i = k; i < score.length; i++) {
                if (temp[0] < score[i]) {
                    temp[0] = score[i];
                }
                Arrays.sort(temp);
                answer[i] = temp[0];
            }
        } else {
            for (int i = 0; i < score.length; i++) {
                if(min > score[i]){
                    min = score[i];
                }
                answer[i] = min;
            }
        }
        return answer;
    }
}