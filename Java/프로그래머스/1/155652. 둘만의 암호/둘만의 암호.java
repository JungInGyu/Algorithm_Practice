class Solution {
    public StringBuilder solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        for(char x : s.toCharArray()){
           for(int i =1; i <= index; i++){
               x+=1;
               if(x > 122){
                    x=97;
               }
               if(skip.contains(String.valueOf(x))){
                   i--;
               }               
           }            
            temp.append(x);
        }            
        return temp;
    }
}