public class Practice_Question1 {
    public static void main(String args[]){
        A ob1 = new B();
        ob1.one();
        // ob1.two(); --- cannot access by refernce of A class
    }
}
class A{
    void one(){
        System.out.println("Hello this is one method");
    }
}
class B extends A{
    void two(){
        System.out.println("Hii, this is two method....");
    }
}