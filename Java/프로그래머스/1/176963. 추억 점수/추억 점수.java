import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> map = new HashMap<>();
        for(int x = 0; x < name.length; x++){
            map.put(name[x],yearning[x]);
        }
        for(int i=0; i < photo.length; i++){
            int temp =0;
            for(String str : photo[i]){
                if(map.containsKey(str)){
                    temp += map.get(str);
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}