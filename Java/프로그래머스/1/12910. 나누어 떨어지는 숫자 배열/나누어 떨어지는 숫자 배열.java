import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        int count =0;
        for(int num : arr){
            if(num % divisor ==0){
                answer.add(num);
                count++;
            }
        }
        if(count ==0){
            answer.add(-1);
        }
        int[] result = new int[answer.size()];
        for(int i=0; i < result.length; i++){
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}