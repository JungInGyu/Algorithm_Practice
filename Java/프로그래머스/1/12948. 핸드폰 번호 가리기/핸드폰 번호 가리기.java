class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length();
        int subIndex = index - 4;
        for(int i=0; i < subIndex; i++){
            answer+="*";
        }    
        return answer+=phone_number.substring(subIndex, index);
    }
}