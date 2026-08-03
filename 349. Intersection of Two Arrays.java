class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1){
            for(int j :nums2){
                if(i==j) set.add(j);
            }
        }
        int[] arr = new int[set.size()];
        int j=0;
        for(int i:set) arr[j++] = i;
        return arr;
    }
}
