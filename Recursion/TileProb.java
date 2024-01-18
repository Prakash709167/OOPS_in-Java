public class TileProb {
    public static int countWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertChoice = countWays(n-1);
        int horizChoice = countWays(n-2);
        int totalways = vertChoice + horizChoice;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(countWays(4));
    }
}