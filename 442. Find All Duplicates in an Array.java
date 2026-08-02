class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue()>1){
                list.add(en.getKey());
            }
        }
        return list;
    }
}
