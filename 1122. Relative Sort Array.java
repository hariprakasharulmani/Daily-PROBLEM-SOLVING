class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i: arr2){
            int count = map.get(i);
            for(int j=0;j<count;j++){
                list.add(i);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i : arr2) {
            set2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        for(int i: map.keySet()){
            if(!set2.contains(i)){
                int count = map.get(i);
                for(int j=0; j<count; j++) {
                    l1.add(i); 
                }
            }
        }
        Collections.sort(l1);
        list.addAll(l1);
        // System.out.println(list);
        int[] arr = new int[list.size()];
        int j = 0;
        for(int i:list){
            arr[j++] = i;
        }
        return arr;
    }
}
