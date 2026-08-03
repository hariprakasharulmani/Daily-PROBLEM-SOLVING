class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        Set<Integer> set = new LinkedHashSet<>();
        for(int i:arr) set.add(i);
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}
