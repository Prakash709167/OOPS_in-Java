public class GridTrick {
    public static int fact(int num){
        int res = 1;
        for(int i= 1; i<=num; i++){
            res = res*i;
        }
        return res;
    }
    public static int ways(int n,int m){
        int w1=(n-1)+(m-1);
        int num=fact(w1);
        int w2 = fact(n-1)*fact(m-1);
        int res = num/w2;
        return res;
    }
    public static void main(String args[]){
        int n=4,m=4;
        System.out.println(ways(n,m));
    }
}