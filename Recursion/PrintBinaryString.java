public class PrintBinaryString {
    public static void BinStr(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinStr(n-1,0,str+"0");
        if(last == 0){
            BinStr(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        BinStr(3,0,"");
    }
}