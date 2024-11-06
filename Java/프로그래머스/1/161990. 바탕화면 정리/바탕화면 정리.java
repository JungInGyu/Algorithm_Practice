import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = 50;
        int rdx = 0;
        Deque<Integer> dequeY = new LinkedList<>();
        for(int i =0; i < wallpaper.length; i++){
            if(!wallpaper[i].contains("#")){
                continue;
            }
            dequeY.add(i);
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, j);
                    rdx = Math.max(rdx, j);
                }
            }
        }
        int[] answer = new int[] {dequeY.getFirst(), lux , dequeY.getLast() + 1, rdx + 1};
        return answer;
    }
}