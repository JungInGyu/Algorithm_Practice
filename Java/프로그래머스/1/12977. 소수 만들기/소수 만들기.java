import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int x = j+1; x < nums.length; x++){
                    temp = nums[i] + nums[j] + nums[x];
                    
                    boolean flag = true;
                    for(int y = 2; y * y <= temp; y++){
                        if(temp % y == 0){
                            flag = false;
                            break;
                        }
                    }
                    answer += flag ? 1 : 0;
                }                
            }
        }
        return answer;
    }
}