public class GetSet{
    public static void main(String args []){
        BankAC2 B2 = new BankAC2();
        B2.setUsername("Aman");
        System.out.println(B2.getName());
        B2.setPassword("abcded");
        System.out.println(B2.getPassword());
        B2.setUsername("Prakash");
        System.out.println(B2.getName());
    }
}
class BankAC2{
    private String username;
    private String password;
    String getName(){
        return this.username;
    }
    String getPassword(){
        return this.password;
    }
    void setUsername(String name){
        username = name;
    }
    void setPassword(String pwd){
        password = pwd;
    }
    
}