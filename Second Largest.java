class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>first){
                second = first;
                first = i;
            }
            if(i!=first && i>second) second = i;
        }
        // if(first==second || first==Integer.MIN_VALUE || second==Integer.MIN_VALUE ) {
        //     return new ArrayList<>(List.of(-1));
        // }
        // else return new ArrayList<>(List.of(first,second));
        return second!=Integer.MIN_VALUE?second:-1;
    }
}
