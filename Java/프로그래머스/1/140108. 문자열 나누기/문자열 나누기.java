class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        char targetX = ' ';
        int index = 0;
        int count = 1;
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            targetX = s.charAt(i);
            count += (x == targetX) ? 1 : 0;
            sum += (x == targetX) ? 0 : 1;
            if(count == sum){
                answer++;
                System.out.println(x);
                index = i + 1;
                if(index < s.length()){
                    x = s.charAt(index);
                }
                count=0;
                sum=0;
            }
        }
        return answer += (count > 0 || sum > 0) ? 1 : 0;
    }
}