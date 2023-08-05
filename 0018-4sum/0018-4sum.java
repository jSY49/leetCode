class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length-1;
        
        if (nums == null || len < 3)
			return res;
        
        Arrays.sort(nums);
    
        
        for(int i=0; i<=len-3;i++){
            for(int j = i+1;j<=len-2;j++){
              int l =j+1;
              int k = len;
                // System.out.println(i+","+j+","+l+","+k);
                while(l<k) {
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[l]+(long)nums[k];
                    // System.out.println(i+","+j+","+l+","+k+"="+sum);
                    if(sum == target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[k]));
                        l++;
                        k--;
                    }else if(sum < target ){
                        l++;
                    }else{
                        k--;
                    }
                }                
            }
            
        }
        
        res.addAll(set);
        return res;
    }
}