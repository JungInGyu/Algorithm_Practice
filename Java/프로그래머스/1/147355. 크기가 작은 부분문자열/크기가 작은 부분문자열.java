class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int index = p.length();
        for(int i=0; i < t.length()-index+1; i++){
            long str = Long.parseLong(t.substring(i,i+index));
            if(str <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}