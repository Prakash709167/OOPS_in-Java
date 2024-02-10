public class N_Queen3 {
    public static boolean n_queen(char board[][],int row){
        //base case
        if(row==board.length){
            // printsolution(board);
            count ++;
            return true;
        }
        //recursion
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                if(n_queen(board,row+1)){
                    return true;
                };
                //backtrack
                board[row][i]='x';
            }
            
        }
        return false;

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
        System.out.println("------------chess board--------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(n_queen(board,0)){
            System.out.println("Solution is possible");
            printsolution(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total possible solution will be : "+ count);
    }
}