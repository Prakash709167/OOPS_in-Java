public class NumInInc {
    public static void PrintInInc(int n){
        if(n==1){
            System.out.println(1+" ");
            return;
        }
        PrintInInc(n-1);
        System.out.println(n);
    }
    public static void main(String args []){
        PrintInInc(10);
    }
}