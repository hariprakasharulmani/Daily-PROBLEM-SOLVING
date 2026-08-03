class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int[] arr = new int[n+m];
        for(int i=0;i<m;i++){
            arr[j++] = nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[j++] = nums2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            nums1[i] = arr[i];
        }
    }
}
