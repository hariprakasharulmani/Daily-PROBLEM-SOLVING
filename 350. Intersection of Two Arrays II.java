class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list = new ArrayList<>();
        int i=0;int j = 0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j+=1;
            }
            else{
                list.add(nums1[i]);
                i+=1;
                j+=1;
            }
        }
        int [] arr = new int[list.size()];
        int z=0;
        for(int l:list) arr[z++] = l;
        return arr;
    }
}
