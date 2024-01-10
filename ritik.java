public class ritik {
    public static void main(String [] args){
        Pen1 p =new Pen1();
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());
    }
    
}


class Pen1{
    private String Color;
    private int tip;


String getColor(){
    return this.Color;
}

int getTip(){
    return this.tip;
}

void setColor(String newColor){
    this.Color=newColor;
}

void setTip(int newTip){
   this.tip=newTip;
}

}