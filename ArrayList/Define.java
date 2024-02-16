import java.util.*;
public class Define {
    public static void main(String args []){
        // Definition of ArrayList
        ArrayList<Integer> List = new ArrayList<>();
        //Operations
        //1. add element
        // System.out.println("add element");
        List.add(8);
        List.add(5);
        List.add(12);
        List.add(3);
        // System.out.println(List);

        //2.get element
        // System.out.println("get element");
        // int x = List.get(2);
        // System.out.println(x);

        //3. remove element
        // System.out.println("remove element");
        // List.remove(2);
        // System.out.println(List);

        //4. set element at index
        // System.out.println("Set element");
        // List.set(2,10);
        // System.out.println(List);

        //5. contains element
        // System.out.println("contains element");
        // System.out.println(List.contains(1));
        // System.out.println(List.contains(11));

        //6. size()
        // System.out.println(List.size());

        //7. Traving in ArrayList
        for(int i = 0 ; i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
        System.out.println();

        //8. Reverse of ArrayList
        // for(int i = List.size()-1;i>=0;i--){
        //     System.out.print(List.get(i)+" ");
        // }
        // System.out.println();
        
        //9. Largest value
        // int max = Integer.MIN_VALUE;
        // for(int i =0;i <List.size();i++){
        //     max = Math.max(max,List.get(i));
        // }
        // System.out.println(max);

        //10. Swap 2 number by method
        // Swapping(List,1,3);

        //11. Sort ArrayList
        Collections.sort(List);//accesnding order
        System.out.println(List);
        Collections.sort(List,Collections.reverseOrder());//decending operator
        System.out.println(List);
        
    }
    public static void Swapping(ArrayList<Integer> list , int index1,int index2){
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
        System.out.println(list);
    }
}