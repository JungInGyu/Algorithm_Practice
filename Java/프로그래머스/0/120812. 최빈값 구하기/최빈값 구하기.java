class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int count_temp = 0;
        for(int i=0; i < array.length; i++){
            count = 1;
            for(int j=i; j < array.length; j++){
                if(array[i] == array[j]){
                    count ++;
                    if(count_temp < count){
                        count_temp = count;
                        answer = array[i];
                    } else if (count_temp == count){
                        answer = -1;
                    }
                }
            }
        }
        return answer;
    }
}