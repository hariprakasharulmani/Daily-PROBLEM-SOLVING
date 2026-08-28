class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        int s = Math.min(list.size(),k);
        int[] arr = new int[s];
        int j = 0;
        for(int i=0;i<s;i++) arr[j++] = list.get(i);
        return arr;
    }
}
