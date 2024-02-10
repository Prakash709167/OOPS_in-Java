public class N_Queen2 {
    public static void n_queen(char board[][],int row){
        //base case
        if(row==board.length){
            // printsolution(board);
            count ++;
            return;
        }
        //recursion
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                n_queen(board,row+1);
                //backtrack
                board[row][i]='x';
            }
            
        }

    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonally left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally right up
        for(int i=row-1,j=col+1; i>=0&&j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printsolution(char board[][]){
        // System.out.println("------------chess board--------------");
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board.length;j++){
        //         System.out.print(board[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    static int count=0;
    public static void main(String args[]){
        int n = 5;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        n_queen(board,0);
        System.out.println("Total possible solution will be : "+ count);
    }
}