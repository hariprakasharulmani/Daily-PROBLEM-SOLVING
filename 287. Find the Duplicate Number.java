class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue()>1) return en.getKey();
        }
        return -1;
    }
}
