class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrStr = s.split(" ", -1);
        for(String str : arrStr) {
            if (str.equals("")){
                answer += " ";
                continue;
            }
            str = str.toLowerCase();
            String firstStr = str.toUpperCase();
            str = firstStr.charAt(0) + str.substring(1, str.length());
            answer = answer + str + " ";
        }
        return answer.substring(0, answer.length()-1);
    }
}