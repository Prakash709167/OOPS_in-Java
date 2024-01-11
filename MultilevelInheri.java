public class MultilevelInheri {
    public static void main(String args []){
        Dog1 doggy = new Dog1();
        doggy.eat();
        doggy.sound2();
    }
}
class Animal1{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Dog1 extends Animal1{
    void sound2(){
        System.out.println("Bark");
    }
}