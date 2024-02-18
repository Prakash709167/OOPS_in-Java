import java.util.*;
public class ContainerWater {
    public static int maxWater(ArrayList<Integer> height){
        int max = 0;
        //bruteForce
        // for(int i =0;i<height.size();i++){
        //     for(int j =i+1;j<height.size();j++){
        //         int length = Math.min(height.get(i),height.get(j));
        //         int base = j-i;
        //         int storeWater = length*base;
        //         max = Math.max(max,storeWater);
        //     }
        // }

        //2pointer approach
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            int length = Math.min(height.get(lp),height.get(rp));
            int base = rp-lp;
            int storeWater = length*base;
            max = Math.max(max,storeWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String args []){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxWater(height));
    }
}