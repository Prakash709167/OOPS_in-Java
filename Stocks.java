public class Stocks {
    public static int fun(int num[]){
        int buyprice = Integer.MAX_VALUE;
        int profit =0;
        int maxProfit = 0;
        for(int i = 0; i<num.length;i++){
            if(num[i]>buyprice){
                profit = num[i]-buyprice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyprice = num[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args []){
        int num[] = {7,6,4,3,1};
        System.out.println(fun(num));
    }
}