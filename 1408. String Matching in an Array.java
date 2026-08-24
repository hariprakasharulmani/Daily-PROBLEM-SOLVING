class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> list = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                else{
                    if(words[j].contains(words[i])){
                        list.add(words[i]);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
}
