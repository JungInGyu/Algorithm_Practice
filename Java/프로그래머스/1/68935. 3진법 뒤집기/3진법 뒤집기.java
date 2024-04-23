class Solution {
    public int solution(int n) {
        StringBuilder str = new StringBuilder();
        str.append(Integer.toString(n,3));
        str.reverse();
        int answer = Integer.parseInt(str.toString(),3);
        return answer;
    }
}