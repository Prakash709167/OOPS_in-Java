import java.util.*;
public class PairSum2 {
    public static void Pairsumm(ArrayList<Integer> list, int taraget){
        int bp = -1;
        int n = list.size();
        for (int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==taraget){
                System.out.print(lp+" "+rp);
                System.out.println();
            }
            if(list.get(lp)+list.get(rp)<taraget){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
    }
    public static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =16;
        System.out.println(list);
        Pairsumm(list,target);
    }
}