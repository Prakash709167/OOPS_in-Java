public class SumOfN {
    public static int Calsum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Calsum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static void main(String args[]){
        System.out.println(Calsum(5));
    }
}