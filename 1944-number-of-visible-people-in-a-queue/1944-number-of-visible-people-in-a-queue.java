class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> st =new Stack<>();
        ans[n-1] =0;
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int k=0;
            if(!st.isEmpty()){
            
                while(!st.isEmpty() && st.peek()<heights[i]){
                    st.pop();
                    k++;
                }
            if(st.size()>0) k++;
            
             st.push(heights[i]);
            ans[i]=k;
            }
        }
        return ans;
    }
}