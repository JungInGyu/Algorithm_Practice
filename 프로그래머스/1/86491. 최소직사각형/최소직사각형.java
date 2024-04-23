class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max =0;
        int min =0;
        for(int i =0; i < sizes.length; i++){
            max = sizes[i][0];
            min = sizes[i][1];
            sizes[i][0] = (max > min) ? max : min;
            sizes[i][1] = (max < min) ? max : min;
            System.out.print(sizes[i][0] + " " + sizes[i][1] + "\n");
        }
        max = sizes[0][0];
        int height = sizes[0][1];
        
        for(int j = 0; j < sizes.length; j++){
            min = sizes[j][0];
            int temp = sizes[j][1];
            if(max < min){
                max = min;
            }
            if(height < temp){
                height = temp;
            }
        }
        return answer = max * height;
    }
}