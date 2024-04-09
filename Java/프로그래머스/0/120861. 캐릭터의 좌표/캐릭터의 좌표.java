class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int up_down=0;
        int le_ri=0;
        for(int i=0; i < keyinput.length; i++){
            if(keyinput[i].equals("up")){
                if(up_down < board[1]/2){
                    up_down +=1;
                }
            } else if(keyinput[i].equals("down")){
                if(up_down > 0 - board[1]/2){
                    up_down -=1;
                }
            } else if(keyinput[i].equals("left")){
                if(le_ri > 0 - board[0]/2){
                    le_ri -=1;
                }
            } else{
                if(le_ri < board[0]/2){
                    le_ri +=1;
                }
            }
        }
        int[] answer = {le_ri,up_down};
        return answer;
    }
}