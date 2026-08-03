class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        List<Integer> list = new ArrayList<>();
        for(int i:a) list.add(i);
        for(int i:b) list.add(i);
        Collections.sort(list);
        int z = 0;
        for(int i=0;i<a.length;i++){
            a[i] = list.get(z++);    
        }
        
        for(int i=0;i<b.length;i++){
            b[i] = list.get(z++);    
        }
    }
}
