import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answerA = {1,2,3,4,5,1,2,3,4,5};
        int[] answerB = {2,1,2,3,2,4,2,5};
        int[] answerC = {3,3,1,1,2,2,4,4,5,5};
        int resultA = 0;
        int resultB = 0;
        int resultC = 0;
        int countAC = 0;
        int countB = 0;
        int[] answer;
        for(int i=0; i < answers.length; i++){
            resultA += (answerA[countAC] == answers[i]) ? 1 : 0;
            resultB += (answerB[countB] == answers[i]) ? 1 : 0;
            resultC += (answerC[countAC] == answers[i]) ? 1 : 0;
            countAC = (countAC == 9) ? 0 : countAC+1;
            countB = (countB == 7) ? 0 : countB+1;
        }
        
        int maxScore = Math.max(resultA, Math.max(resultB, resultC));
        
        List<Integer> topScorers = new ArrayList<>();
        if (resultA == maxScore) topScorers.add(1);
        if (resultB == maxScore) topScorers.add(2);
        if (resultC == maxScore) topScorers.add(3);
        
        return topScorers;
    }
}