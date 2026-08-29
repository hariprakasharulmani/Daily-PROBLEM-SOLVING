class Solution {
    public int countAsterisks(String s) {
        int lok  =  0;
        int count =  0;
        for(char c : s.toCharArray()){
            if(c == '|'){
                count++;
            }
            if(count==2){
                count=0;
            }
            if(c=='*' && count==0){
                lok++;
            }
        }
        return lok;
    }
}
