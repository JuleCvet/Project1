
package accountdesign;


public class Deposit extends Transaction{
    
    public Deposit(int amount){//ni treba amount za da stavame pari
        super(amount);  
    }
    
    @Override
    public void print(){
        System.out.println(super.toString() + " deposit");
    }  
}
