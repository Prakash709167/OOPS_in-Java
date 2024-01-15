public class Fact {
    public static int factorial(int n){
        int result = 1;
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}