class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0;
        int even = 0;
        for(int i:arr){
            if(i%2==0) even+=1;
            else odd+=1;
        }
        return new int[]{odd,even};
    }
}
