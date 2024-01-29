public class Question_26 {
    public static int fun(int num []){
        int k = 1;
        for(int i = 1;i<num.length;i++){
            if(num[i]!=num[i-1]){
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int num[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(fun(num));
    }
}