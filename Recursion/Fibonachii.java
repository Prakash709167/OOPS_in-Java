public class Fibonachii {
    public static int calFibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=calFibo(n-1);
        int fnm2 = calFibo(n-2);
        int fn = fnm1 +fnm2;
        return fn;
    }
    public static void main(String args []){
        System.out.println(calFibo(5));
    }
}