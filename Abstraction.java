public class Abstraction {
    public static void main(String args []){
        Mustang m1 = new Mustang();
        m1.walk();
    }
}
abstract class Animal5{
    Animal5(){
        System.out.println("Animal5 constructor is called....");
    }
    void eats(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal5{
    Horse(){
        System.out.println("Horse constructor is called....");
    }
    @Override
    void walk(){
        System.out.println("Horse is running fast");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called....");
    }
    @Override
    void walk(){
        System.out.println("Mustang is running fast");
    }
}