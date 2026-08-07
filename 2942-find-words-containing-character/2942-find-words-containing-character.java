class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            int m=words[i].length();
            for(int j=0;j<m;j++){
                if(words[i].charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}