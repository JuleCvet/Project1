
package accountdesign;

public class TransferFrom extends Transaction {//dovolno e samo extends
    
    private Account from;
    
    public TransferFrom(int amount, Account from){
        super(amount);
        this.from = from;       
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " transfer from " + from.getOwner());
    } 
}
