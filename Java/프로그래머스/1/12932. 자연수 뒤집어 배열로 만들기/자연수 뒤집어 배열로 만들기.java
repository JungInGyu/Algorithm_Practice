class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int count=answer.length-1;
        for(char ch : num.toCharArray()){
            answer[count] = ch - '0';
            count--;
        }
        return answer;
    }
}