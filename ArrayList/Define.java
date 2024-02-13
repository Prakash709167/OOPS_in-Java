import java.util.*;
public class Define {
    public static void main(String args []){
        // Definition of ArrayList
        ArrayList<Integer> List = new ArrayList<>();
        //Operations
        //1. add element
        System.out.println("add element");
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);

        //2.get element
        System.out.println("get element");
        int x = List.get(2);
        System.out.println(x);

        //3. remove element
        System.out.println("remove element");
        List.remove(2);
        System.out.println(List);

        //4. set element at index
        System.out.println("Set element");
        List.set(2,10);
        System.out.println(List);

        //5. contains element
        System.out.println("contains element");
        System.out.println(List.contains(1));
        System.out.println(List.contains(11));



    }
}