public class StaticinKeyword {
    public static void main(String args[]){
        Bachho B1 = new Bachho();
        B1.setName("Ritik");
        System.out.println(B1.getName());
        B1.schoolname = "SRT";
        Bachho B2 = new Bachho();
        System.out.println(B2.schoolname);
    }
}
class Bachho{
    private String name;
    int roll;

    static String schoolname;

    void setName(String newName){
        this.name = newName;
    }
    String getName(){
        return this.name;
    }
}