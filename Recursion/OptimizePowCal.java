public class OptimizePowCal {
    public static int OptimalPow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfwork = OptimalPow(x,n/2);
        int halfpowersq = halfwork*halfwork;
        if(n%2!=0){
            halfpowersq = x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
        System.out.println(OptimalPow(2,5));
    }
}