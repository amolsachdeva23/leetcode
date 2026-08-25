class Solution {
    public int minimumRounds(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int k=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

          int number = entry.getKey();
          int freq = entry.getValue();
          if(freq==1) return -1;
          if(freq%3==0) k+=freq/3;
          else{
            k+= freq/3+1;
          }
         
        
          
        }
        return k;
    }
}