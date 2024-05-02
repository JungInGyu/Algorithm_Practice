import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int x=1; x<numbers.length; x++){
                if(i == x){
                    continue;
                }
                int temp = numbers[i] + numbers[x];
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}