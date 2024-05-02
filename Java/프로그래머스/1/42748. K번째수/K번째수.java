import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i < commands.length; i++){
            int index = commands[i][0];
            int index2 = commands[i][1];
            int numIndex = commands[i][2];
            int[] temp = new int[index2 - index +1];
            int count = 0;
            for(int x=index-1; x <= index2-1; x++){
                temp[count] = array[x];
                count++;
            }
            Arrays.sort(temp);
            answer[i] = temp[numIndex-1];
        }
        return answer;
    }
}