class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int x = 0;
        for(int i=0;i<n;i++){
            Set<Integer> left = new HashSet<>();
            for(int j=0;j<=i;j++){
                left.add(nums[j]);
            }
            Set<Integer> right = new HashSet<>();
            for(int j=i+1;j<n;j++){
                right.add(nums[j]);
            }
            arr[x++] = left.size() - right.size();
        }
        return arr;
    }
}
