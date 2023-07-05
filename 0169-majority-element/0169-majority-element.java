class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        
        int idx=0;
        for(int a : nums){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
            idx++;
        }
        
        int res=0;
        for(int a : map.keySet()){
            if(map.get(a)>(n/2)){
                res = a;
            }
        }
        
        return res;
    }
}