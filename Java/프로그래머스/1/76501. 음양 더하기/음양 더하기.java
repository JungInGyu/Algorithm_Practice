class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int index=0;
        for(boolean flag : signs){
            answer += flag ? absolutes[index] : absolutes[index]-(absolutes[index]*2);
            index++;
        }
        return answer;
    }
}