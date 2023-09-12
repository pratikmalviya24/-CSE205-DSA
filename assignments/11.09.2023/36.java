class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                char num = board[i][j];
                board[i][j] = '.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }
        }

        return true;
    }
    public static boolean isValid(char[][] board,int row,int col,char num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }
      
        for(int i=0;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
        }
    
        int row_idx = 3*(row/3);
        int col_idx = 3*(col/3);
        for(int i=row_idx;i<row_idx+3;i++){
            for(int j=col_idx;j<col_idx+3;j++){
                if(board[i][j]==num){
                return false;
            }
            }
        }
        
        return true;
    }
}