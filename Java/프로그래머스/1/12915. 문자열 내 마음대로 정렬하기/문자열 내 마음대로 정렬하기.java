import java.util.*;
class Solution {
    public String[] solution(String[] str, int n) {
        Comparator<String> indexCom = (s1,s2) ->{
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            int result = Character.compare(c1,c2);
            if(result == 0){
                return s1.compareTo(s2);
            } else {
               return result;
            }
        };
        Arrays.sort(str,indexCom);        
        return str;
    }
}