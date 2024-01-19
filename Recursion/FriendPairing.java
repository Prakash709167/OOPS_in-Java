public class FriendPairing {
    public static int totalwayofpair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = totalwayofpair(n-1);
        int fnm2 = totalwayofpair(n-2);
        int pairway = (n-1) * fnm2;
        int totalway = fnm1 + pairway;
        return totalway;
    }
    public static void main(String args[]){
        System.out.println(totalwayofpair(5));
    }
}