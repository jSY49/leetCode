class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Integer[] arr = new Integer[rowIndex+1];
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<=rowIndex;i++){
            arr.add(1);
    		for(int j=i-1;j>0;j--) {
    			arr.set(j, arr.get(j-1)+arr.get(j));
    		}
        }
        System.out.println(arr);
        return arr;
        
    }
}