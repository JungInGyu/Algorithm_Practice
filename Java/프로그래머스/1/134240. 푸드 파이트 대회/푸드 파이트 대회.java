class Solution {
    public String solution(int[] food) {
        String answer = "";
        int count=1;
        while(count < food.length){
            for(int i=0;  i < (food[count] / 2); i++){
                answer+=count;
            }
            count++;
        }
        StringBuilder str = new StringBuilder();
        str.append(answer);
        str.reverse();
        answer+="0";
        answer+=str.toString();
        return answer;
    }
}