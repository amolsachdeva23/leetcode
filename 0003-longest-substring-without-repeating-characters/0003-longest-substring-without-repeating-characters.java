class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int max=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
            set.add(ch);
            j++;
            }
            else{
                int len=j-i;
                max=Math.max(len,max);
                while(s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len=j-i;
        max=Math.max(len,max);
        return max;
    }
}