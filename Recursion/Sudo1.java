public class Sudo1 {
    public static void fun(int n){
        if(n>0){
            fun(--n);
            System.out.print(n);
            fun(--n);
        }
    }
    public static void main(String args[]){
        fun(4);
    }
}