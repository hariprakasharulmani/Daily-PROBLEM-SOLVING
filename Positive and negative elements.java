class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        // code here
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i:arr){
            if(i>0) pos.add(i);
            else if(i<0) neg.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                result.add(pos.get(i));
                result.add(neg.get(i));
            }
            for(int i=neg.size();i<pos.size();i++){
                result.add(pos.get(i));
            }
            //result.addAll(pos);
            return result;
        }
        else if(pos.size()==neg.size()){
            for(int i=0;i<pos.size();i++){
                result.add(pos.get(i));
                result.add(neg.get(i));
            }
            return result;
        }
        else if(pos.size()<neg.size()){
            for(int i=0;i<pos.size();i++){
                result.add(pos.get(i));
                result.add(neg.get(i));
            }
            for(int i=pos.size();i<neg.size();i++){
                result.add(neg.get(i));
            }
            //result.addAll(neg);
            return result;
        }
        return result;
    }
}
