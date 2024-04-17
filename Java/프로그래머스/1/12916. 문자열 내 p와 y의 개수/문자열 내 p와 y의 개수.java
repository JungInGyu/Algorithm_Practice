import java.util.*;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count_p = 0;
        int count_y = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'y'){
                count_y++;
            } else if(ch == 'p'){
                count_p++;
            }
        }
        boolean answer = (count_y == count_p) ? true : false;
        return answer;
    }
}