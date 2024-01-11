public class SingleInheri {
    public static void main(String args []){
        Fish shark = new Fish();
        shark.eat();
        shark.swims();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}