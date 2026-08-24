class Solution {
    public int maxDigitRange(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            int local_max = Integer.MIN_VALUE;
            int local_min = Integer.MAX_VALUE;
            int og = i;
            while(i!=0){
                local_max = Math.max(local_max,i%10);
                local_min = Math.min(local_min,i%10);
                i/=10;
            }
            int diff = local_max - local_min;
            //System.out.println(diff);
            map.put(og,diff);
            max = Math.max(max,diff);
        }
        //System.out.println(map);
        //System.out.println(max);
        int sum = 0;
        // for(Map.Entry<Integer,Integer> en : map.entrySet()){
        //     if(en.getValue()==max) sum += en.getKey();
        // }
         for(int i:nums){
            if(map.get(i)==max) sum +=i;
        }
        return sum;
    }
}
