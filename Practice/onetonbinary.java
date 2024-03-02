import java.util.*;
import java.util.LinkedList;
public class onetonbinary {
    static ArrayList<Integer> solution(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(n-- > 0){
            int temp = q.remove();

            ans.add(temp);
            q.add(temp*10);
            q.add((temp*10)+1);
        }
        return ans;
    }
    public static void main(String args []){
        int n =15;
        ArrayList<Integer> list = solution(n);
        System.out.println(list);
    }
}