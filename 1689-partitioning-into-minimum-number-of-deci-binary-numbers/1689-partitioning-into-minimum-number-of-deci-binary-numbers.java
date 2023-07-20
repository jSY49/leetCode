class Solution {
    public int minPartitions(String n) {
        //각 자리수 중 가장 큰 수 찾으면 됨 
        int max = 0;
        
        for(char ch : n.toCharArray()){
            int num = ch-'0';
            max= Math.max(max,num);
        }
        
        return max;
    }
}