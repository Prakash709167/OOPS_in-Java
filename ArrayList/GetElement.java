import java.util.*;
public class GetElement {
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("add element");
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        System.out.println("get element");
        int x = List.get(2);
        System.out.println(x);
    }
}