public class MultiInheri_Interface {
    public static void main(String args []){
        Beer panda = new Beer();
        panda.grass();
        panda.meat();
    }
}
interface Herbivore{
    void grass();
}
interface Carnivore{
    void meat();
}
class Beer implements Herbivore,Carnivore{
    @Override
    public void grass(){
        System.out.println("Beer can eat grass....");
    }
    @Override
    public void meat(){
        System.out.println("Beer can eat meat also.......");
    }
}