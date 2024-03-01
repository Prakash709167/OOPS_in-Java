import java.util.*;
import java.util.LinkedList;
public class GenerateBinary {
    static ArrayList<String> solution(int n){
        ArrayList<String> ans = new ArrayList<>();
        Queue <String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String temp = q.remove();

            ans.add(temp);
            q.add(temp+"0");
            q.add(temp+"1");
        }
        return ans;
    }
    public static void main(String args[]){
        int n = 10;
        ArrayList<String> result = solution(n);
        System.out.println(result);
    }
}