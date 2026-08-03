class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int[] nums = new int[arr.length];
        int j=0;
        for(int i:arr) if(i!=0) nums[j++] = i;
        for(int i=0;i<nums.length; i++) arr[i] = nums[i];
    }
}
