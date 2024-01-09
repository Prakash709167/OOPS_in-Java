public class AccesssMOD{
    public static void main(String args []){
        BankAC B1 = new BankAC();
        B1.setPassword("abcded");
        B1.username = "Aman";
        System.out.println(B1.username);
    }
}
class BankAC{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    
}