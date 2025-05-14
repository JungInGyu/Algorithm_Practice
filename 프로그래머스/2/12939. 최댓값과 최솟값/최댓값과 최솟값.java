import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrStr = s.split(" ");
        int[] num = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            String numStr = arrStr[i];
            num[i] = Integer.parseInt(numStr);
        }
        Arrays.sort(num);
        answer = String.valueOf(num[0] + " ") + String.valueOf(num[num.length-1]);

        return answer;
    }
}