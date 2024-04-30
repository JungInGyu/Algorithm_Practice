class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken > 9){
            int coupon = chicken / 10;
            int temp = chicken % 10;
            chicken = coupon + temp;
            answer += coupon;
        }
        return answer;
    }
}