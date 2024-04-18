class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int temp =0;
        for(char ch : str.toCharArray()){
            temp+= ch - '0';
        }
        return x % temp == 0 ? true : false;
    }
}