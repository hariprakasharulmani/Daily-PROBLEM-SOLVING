class Solution {
    public void rotate(int[] arr) {
        // code here
        int k = 1;
         reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
       
    }
    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
