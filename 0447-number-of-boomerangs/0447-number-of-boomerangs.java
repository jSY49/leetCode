class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap();
        int res = 0;
        
        for (int[] p1 : points) {
            for (int[] p2 : points) {
                int dist = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for (Integer v : map.values())
                res += v * (v - 1);
            System.out.println(map+","+res);
            map.clear();
        }
        
        
        return res; 
    }
    
}