import java.util.*;
public class PairSum {
    public static void pair(ArrayList<Integer> list,int tar){
//      Brute force method
        // for(int i = 0;i<list.size();i++){
        //     for(int j =i+1;j<list.size();j++){
        //         if(list.get(i)+list.get(j)==tar){
        //             System.out.print(i+" "+j);
        //             System.out.println();
        //         }
        //     }
        // }
//       2 pointer method (optimized solution) 
            int lp =0;
            int rp = list.size()-1;
            while(lp<rp){
                if(list.get(lp)+list.get(rp)==tar){
                    System.out.print(lp+" "+rp);
                    System.out.println();
                }
                if(list.get(lp)+list.get(rp)<tar){
                    lp++;
                }
                else{
                    rp--;
                }
            }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        pair(list,target);
    }
}