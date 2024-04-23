import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        String str = "";
        String result = "";
        for(char ch : s.toCharArray()){
            str+=ch;
            if(map.containsKey(str)){
                result+= map.get(str);
                str="";
            }else if(Character.isDigit(ch)){
                result+=ch;
                str="";
            }
        }
        return answer = Integer.parseInt(result);
    }
}