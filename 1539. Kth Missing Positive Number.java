class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr[arr.length-1]+k;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        for(int i=1;i<=n;i++) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue()==1){
                list.add(en.getKey());
            }
        }
        return list.get(k-1);
    }
}
