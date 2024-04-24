import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Integer,Character> map = new HashMap<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(map.containsValue(ch) != true){
                answer[count] = -1;
            }
            map.put(count,ch);
            count++;
        }
        for(int i = 0; i < map.size(); i++){
            for(int j = i - 1; j >= 0; j--){
                if(map.get(j) == map.get(i)){
                    answer[i] = Math.abs(i - j);
                    break;
                }
            }
        }
        return answer;
    }
}