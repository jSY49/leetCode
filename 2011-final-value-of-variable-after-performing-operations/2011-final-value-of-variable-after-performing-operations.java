class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for(String str : operations){
            switch(str){
                case "X++": case "++X": x+=1; break;
                case "X--": case "--X": x-=1; break;
                    
            }
        }
        return x;
    }
}