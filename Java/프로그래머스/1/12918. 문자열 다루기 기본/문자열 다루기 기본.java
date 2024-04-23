class Solution {
    public boolean solution(String s) {
        boolean answer = (s.length() == 4 || s.length() == 6) ? true : false;
        if(answer == true){
            for(char ch : s.toCharArray()){
                if(ch >= 65){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}