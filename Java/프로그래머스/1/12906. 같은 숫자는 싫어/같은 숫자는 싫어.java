import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        StringBuilder str = new StringBuilder();
        str.append(arr[0]);
        int temp = arr[0];
        for(int num : arr){
            if(temp != num){
                str.append(num);
                temp = num;
            }
        }
        answer = new int[str.length()];
        int count =0;
        for(char ch : str.toString().toCharArray()){
            answer[count] = ch - '0';
            count++;
        }
        return answer;
    }
}