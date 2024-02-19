import java.util.*;
public class PairSum {
    public static void pairsum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;
        // int bp = 0;
        // int n = list.size();
        // for(int i = 0;i<list.size();i++){
        //     if(list.get(i)>list.get(i+1)){
        //         bp = i;
        //         break;
        //     }
        // }
        // lp = bp+1;
        // rp=bp;
        // while(lp!=rp){
        //     if(list.get(lp)+list.get(rp)==target){
        //         System.out.println(lp+" "+rp);
        //     }
        //     if(list.get(lp)+list.get(rp)<target){
        //         lp = (lp+1)%n;
        //     }
        //     else{
        //         rp = ((n+rp)-1)%n;
        //     }
        // }

        Collections.sort(list);
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                        System.out.println(lp+" "+rp);
                    }
                    if(list.get(lp)+list.get(rp)<target){
                        lp++;
                    }
                    else{
                        rp--;
                    }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 17;
        pairsum(list,target);


    }
}