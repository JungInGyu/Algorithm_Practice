import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> words = new HashSet<>(Arrays.asList("aya", "ye", "woo", "ma"));
        for(String str : babbling){
            if(str.contains("ayaaya") || str.contains("yeye") ||
               str.contains("woowoo") || str.contains("mama")) {
                continue;
        }
            String temp = str;
            for(String res : words){
                temp = temp.replace(res," ");
            }
            if(temp.trim().isEmpty())
                answer++;
        }
        return answer;
    }
}