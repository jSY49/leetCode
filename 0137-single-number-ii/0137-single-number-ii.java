class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res=0; 
        for(int i=0; i<nums.length;i++){
            int tmp = nums[i];
            if(map.containsKey(tmp)){
                map.put(tmp,map.get(tmp)+1);
            }else{
                map.put(tmp,1);
            }
        }
        
        for(int k : map.keySet()){
            if(map.get(k)==1){
                res = k;
            }
        }
        
        return res;
    }
}