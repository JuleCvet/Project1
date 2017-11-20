
package accountdesign;

public class AccountDesign {
    
    public static void main(String[] args) {
        Account a1 = new Account("ulf");//kreirame nov acount so ime
        Account a2 = new Account("Anna");//za da gi koristime glavnata privatna klasa,
        //abstraktnata klasa za transakcii i site subklasi shto ja extendiraat
        a1.deposit(200);
        a1.withdraw(170);
        
        a2.deposit(300);
        a2.transferTo(100, a1);
        
        a1.printAll();
        a2.printAll();
    }
}
