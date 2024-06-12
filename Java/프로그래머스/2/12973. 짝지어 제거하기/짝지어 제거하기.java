import java.util.*;
class Solution{
    public int solution(String s){
        int answer = -1;
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();

        for(String str : arr){
            if (!stack.empty() && stack.peek().equals(str)){
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        answer = (stack.isEmpty()) ? 1 : 0;
        return answer;
    }
}