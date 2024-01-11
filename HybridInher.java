public class HybridInher {
    public static void main(String args []){
        Dog3 d1 = new Dog3();
        Peacock p1 = new Peacock();
        d1.eat();
        p1.breathe();
    }
}
class Animal3{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Birds2 extends Animal3{
    void fly(){
        System.out.println("Fly");
    }
}
class Mammal1 extends Animal3{
    void walk(){
        System.out.println("Walks");
    }
}
class Dog3 extends Mammal1{
    void sound1(){
        System.out.println("Bark");
    }
}
class Peacock extends Birds2{
    void dance(){
        System.out.println("Dance");
    }
}