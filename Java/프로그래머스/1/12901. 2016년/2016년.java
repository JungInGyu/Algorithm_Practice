import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Map<Integer, String> map = new HashMap<>();
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDay = b;
        map.put(1,"FRI");
        map.put(2,"SAT");
        map.put(3,"SUN");
        map.put(4,"MON");
        map.put(5,"TUE");
        map.put(6,"WED");
        map.put(0,"THU");
        for(int i=0; i < a - 1; i++){
            totalDay += month[i];
        }
        return answer = map.get(totalDay%7);
    }
}