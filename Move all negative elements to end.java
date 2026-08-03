class Solution {
    public void segregateElements(int[] arr) {
        // code here
        
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i:arr){
          if(i>=0){
              pos.add(i);
          }
          if(i<0) neg.add(i);
        } 
   
        int j=0;
        for(int i:pos){
            arr[j++] = i;
        }
        for(int i:neg){
            arr[j++] = i;
        }
        
    }
}
