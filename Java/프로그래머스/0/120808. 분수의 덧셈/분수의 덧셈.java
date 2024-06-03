class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int den = denom1;
        int den2 = denom2;
        int num1 = numer1;
        int num2 = numer2;
        int count = 2;
        int countDe = 2;
        if(den != numer1){
            while(den != den2){
                den = denom1;
                num1 = numer1;
                den *= count;
                num1 *= count;
                count++;
                if(den > den2){
                    den2 = denom2;
                    den2*=countDe;
                    num2 = numer2;
                    num2 *= countDe;
                    countDe++;
                }
            }
        }
        int gcd = gcd((num1+num2),den);
        answer[0] = (num1 + num2) / gcd;
        answer[1] = den/gcd;
        return answer;
    }
    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}