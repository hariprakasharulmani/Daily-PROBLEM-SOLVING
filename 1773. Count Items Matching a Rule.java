class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int res = 0;
        if(ruleKey.equals("type")){
            res = 0;
        }
        if(ruleKey.equals("color")){
            res = 1;
        }
        if(ruleKey.equals("name")){
            res = 2;
        }
        // int type = 0;
        // int color = 1;
        // int name = 2;
        // System.out.println(res);
        for(int i=0;i<items.size();i++){
            //for(int j=0;j<items.get(i).size();j++){
                if((items.get(i).get(res)).equals(ruleValue)) count++;
            //}
        }

        return count;
    }
}
