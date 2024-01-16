public class CalPower {
    public static int Pow(int x, int n){
        /**
                n  _>return 32 as answer
        x=2,n=5 |  | return 16*2=32   nm1=32
        x=2 n=4 |  | return 8*2=16    nm1=16
        x=2;n=3 |  | return 4*2=8     nm1=8
        x=2;n=2 |  | return 2*2=4     nm1=4
        x=2;n=1 |  | return 1*2=2     nm1=2
        x=2;n=0 |  | return 1         nm1=1
               <-
        */
        if(n==0){
            return 1;
        }
        int nm1 = Pow(x,n-1);
        int xn = x*nm1;
        return xn;
        /*
        or in single line we can write 
        
           return x*pow(x,n-1);
        
        */
    }
    public static void main(String args[]){
        System.out.println(Pow(2,5));
    }
}