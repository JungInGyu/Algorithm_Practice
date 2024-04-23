import java.math.BigInteger;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        BigInteger num1 = BigInteger.valueOf(n);
        BigInteger num2 = BigInteger.valueOf(m);
        
        BigInteger gcd = num1.gcd(num2);
        BigInteger lcm = num1.multiply(num2).divide(gcd);
        answer[0] = gcd.intValue();
        answer[1] = lcm.intValue();
        return answer;
    }
}