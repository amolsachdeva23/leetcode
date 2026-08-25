class Solution {
    public int partitionString(String s) {
       
        HashSet<Character> set = new HashSet<>();
        int k= 1;
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        int curr=0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch-'a']>=curr){
                k++;
                curr=i;
            }
            arr[ch-'a']=i;
        }
        return k;
 }
}