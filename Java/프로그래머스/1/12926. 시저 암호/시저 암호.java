class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                answer+=" ";
            } else if (ch >= 65 && ch <= 90){
                if(ch+n > 90){
                    ch = (char) (ch + n - 26);
                    answer += ch;
                } else{
                    ch = (char) (ch + n);
                    answer += ch;
                }
            } else {
                if(ch + n > 122){
                    ch = (char) (ch + n - 26);
                    answer += ch;
                } else{
                    ch = (char) (ch + n);
                    answer += ch;
                }
            }
        }
        return answer;
    }
}