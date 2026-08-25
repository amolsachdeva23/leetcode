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
          if(freq == 1) return -1;
        //   
         k += (freq + 2) / 3;
          
        }
        return k;
    }
}