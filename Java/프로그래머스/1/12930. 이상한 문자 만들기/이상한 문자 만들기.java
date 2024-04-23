class Solution {
    public String solution(String s) {
        String answer = "";
        int count =1;
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                answer+= ' ';
                count = 1;
            } else{
                answer += (count%2 == 1) ? Character.toString(ch).toUpperCase() :
                Character.toString(ch).toLowerCase();
                count++;
            }
        }
        return answer;
    }
}