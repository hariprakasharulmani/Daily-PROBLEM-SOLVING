class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i:nums){
            if(i!=0) arr[j++] =i;
        }
        for(int i=0;i<nums.length;i++) nums[i] = arr[i];
    }
}
