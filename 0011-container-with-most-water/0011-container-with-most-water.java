class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max =0; 
        int start=0, end=n-1;
        
        while(start < end){
            max = Math.max(max, (end-start)*Math.min(height[start],height[end]));
            //길이가 짧은 쪽말고 다른 걸 탐색(짧은 쪽이 길 수록 넓이 커질 가능성 있음)
            if(height[start]<height[end])   start++;
            else if(height[start]>height[end])  end--;
            else {  start++; end--; }
        }
        
        return max;
    }
    
}