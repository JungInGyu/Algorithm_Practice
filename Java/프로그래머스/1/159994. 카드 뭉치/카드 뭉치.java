class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i < goal.length; i++){
            answer = (goal[i].equals(cards1[count_1]) || goal[i].equals(cards2[count_2])) ? "Yes" : "No";
            if(answer.equals("No")){
                break;
            }
            count_1 += (goal[i].equals(cards1[count_1])) ? 1 : 0;
            count_2 += (goal[i].equals(cards2[count_2])) ? 1 : 0;
            count_1 -= (cards1.length == count_1) ? 1 : 0;
            count_2 -= (cards2.length == count_2) ? 1 : 0;
        }
        return answer;
    }
}