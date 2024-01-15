public class NumInDec {
    public static void PrintInDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        PrintInDec(n-1);
    }
    public static void main(String args []){
        PrintInDec(10);
    }
}