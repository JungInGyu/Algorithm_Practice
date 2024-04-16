import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> list = new ArrayList<>();
        
        for(int num : numlist){
            list.add(num);
        }
        
        list.sort((a,b) ->{
            int temp_A = Math.abs(a - n);
            int temp_B = Math.abs(b - n);
            if(temp_A == temp_B){
                return b - a;
            } else{
                return temp_A - temp_B;
            }
        });
        
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}