public class SuperKey {
    public static void main(String args []){
        Ghora g1 = new Ghora();
        System.out.println(g1.color);
    }
}
class Janawar{
    String color;
    Janawar(){
        System.out.println("Animal constructor called.........");
    }
}
class Ghora extends Janawar{
   
    Ghora(){
        super.color = "yellow";
        System.out.println("Ghora constructor is calledd................");
    }
}