public  class Overloading {
    public static void main(String args []){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(25,35));
        System.out.println(c1.sum(10.5f,9.5f));
        System.out.println(c1.sum(5,6,4));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}