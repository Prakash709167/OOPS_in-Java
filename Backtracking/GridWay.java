public class GridWay {
    public static int CountWays(int i, int j, int n, int m){
        if(i==n-1 || j ==m-1){//base case
            return 1;
        }
        else if(i==n || j==m){//corner case out of boundary
            return 0;
        }
        int w1 = CountWays(i+1,j,n,m);
        int w2 = CountWays(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n =4,m=4;
        System.out.println(CountWays(0,0,n,m));
    }
}