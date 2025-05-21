class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String temp = s;
        int index = 0;
        int deleteNum = 0;
        while (temp.length() > 1) {
            String tempStr = "";
            for (int i = 0; i < temp.length(); i++){
                if(temp.charAt(i) == '0'){
                    deleteNum++;
                    continue;
                };
                tempStr += '1';
            }
            temp = Integer.toBinaryString(tempStr.length());
            index++;
        }
        answer = new int[]{index, deleteNum};
        return answer;
    }
}