public class Overriding {
    public static void main(String args[]){
        Billi B1 = new Billi();
        B1.eat();
    }
}
class Janwar{
    void eat(){
        System.out.println("Eats");
    }
}
class Billi extends Janwar{
    @Override
    void eat(){
        System.out.println("Billi machali khati h");
    }
}