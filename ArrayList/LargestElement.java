import java.util.*;
public class LargestElement {
    public static void Largest(ArrayList<Integer> list){
        int max = 0;
        for(int i = 0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println("Largest elemnt will be :"+max);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(3);
        list.add(10);
        list.add(12);
        list.add(8);
        Largest(list);
    }
}