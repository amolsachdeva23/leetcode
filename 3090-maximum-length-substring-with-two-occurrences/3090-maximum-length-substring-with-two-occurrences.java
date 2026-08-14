class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int j=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                freq[s.charAt(j)-'a']--;
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}