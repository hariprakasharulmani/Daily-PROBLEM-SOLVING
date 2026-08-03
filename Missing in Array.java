class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        long sum = 0;
        for(int i:arr) sum+=i;
        long n = arr.length+1;
        long total = n*(n+1)/2;
        return (int)(total-sum);
    }
}
