class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        
        //each Row & Col
        for(i in 0 until 9){
            for(j in 0 until 9){
                var tmp = board[i][j]
                 if(tmp!='.'){
                       for(k in j+1 until 9){
                            if(tmp == board[i][k]){ 
                                print("$tmp $i,$j  k=$k")
                                return false
                            }
                       }
                       for(l in i+1 until 9){
                            if(tmp == board[l][j]) {
                                print("$tmp $i,$j  l=$l")
                                return false
                            }
                       }   
                 }
            }
           
        }
        
        //box 
        for(i in 0 until 9 step 3){
            for(j in 0 until 9 step 3){
                if(!boxCheck(board, i,j)) return false
            }
        }
        
        return true
    }
    
    fun boxCheck(b: Array<CharArray>, r : Int , c :Int) :Boolean{
        
        var check = Array<Boolean>(10){false}
        
        for(i in r until r+3){
            for(j in c until c+3){
                if(b[i][j]!='.'){
                    var num = Character.getNumericValue(b[i][j])
                    print(num)
                    if(check[num]){
                        return false 
                    }else{
                    check[num] = true
                    }
                }
                
                
            }
        }
        
        return true
    }
}