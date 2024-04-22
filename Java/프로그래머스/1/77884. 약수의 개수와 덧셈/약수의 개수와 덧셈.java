class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int temp=0;
        int count=0;
        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            answer = (count % 2==0) ? answer + i : answer - i;
            count=0;
        }
        return answer;
    }
}