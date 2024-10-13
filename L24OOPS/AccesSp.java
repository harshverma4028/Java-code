// package mypackage;
package L24OOPS;
/**
 * InnerAccesSp
 */
class Account {
    public String name;
    protected String email;
    private String password;

    public void Printthis(){
        System.out.println(name);
    }
    
}
public class AccesSp {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="harsh verma";
        a1.email="harshverma4028@gmail.com";
        // a1.password="harsh";

        System.out.println(a1.name);
    }
}
