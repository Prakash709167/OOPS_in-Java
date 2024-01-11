public class HeriachialInher {
    public static void main(String args []){
        Dog doggy1 = new Dog();
        Mammal Elephant = new Mammal();
        doggy1.sound1();
        doggy1.eat();
        Elephant.breathe();
        Elephant.walk();
    }
}
class Animal2{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Dog extends Animal2{
    void sound1(){
        System.out.println("Bark");
    }
}
class Mammal extends Animal2{
    void walk(){
        System.out.println("Walks");
    }
}