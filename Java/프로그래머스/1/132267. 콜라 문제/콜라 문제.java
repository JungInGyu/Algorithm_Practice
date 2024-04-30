class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
          int temp = n % a;
          int result = b * (n / a);
          n = result + temp;
          answer += result;
        }
        return answer;
    }
}