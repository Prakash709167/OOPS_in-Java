public class Question_67 {
    public static String sum(String a, String b){
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int add = num1+num2;
        String result = Integer.toBinaryString(add);
        return result;
    }
    public static void main(String args[]){
        String a = "1010";
        String b = "1011";
        System.out.println(sum(a,b));
    }
}