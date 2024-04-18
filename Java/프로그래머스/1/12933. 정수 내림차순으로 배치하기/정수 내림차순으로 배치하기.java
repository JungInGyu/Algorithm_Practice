import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        long[] temp = new long[str.length()];
        int index=0;
        for(char ch : str.toCharArray()){
            temp[index] = ch - '0';
            index++;
        }
        Arrays.sort(temp);
        str="";
        for(int i=0; i < temp.length; i++){
            str+= Long.toString(temp[index-1]);
            index--;
        }
        answer = Long.parseLong(str);
        return answer;
    }
}