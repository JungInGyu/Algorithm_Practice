import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        answer = new int[(arr.length <= 1) ? 1 : arr.length -1];
        int min = arr[0];
        for(int num : arr){
            if(min > num){
                min = num;
            }
        }
        int count = 0;
        for(int num : arr){
            if(num > min){
                answer[count] = num;
                count++;
            } else if(arr.length == 1){
                answer[0] = -1;
            }
        }
        return answer;
    }
}