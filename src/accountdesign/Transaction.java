
package accountdesign;

import java.util.Date;

public abstract class Transaction {//nikoj ne ja gleda a site ja koristat i nasleduvaat
    
    private int id;//imat ID
    private Date timeStamp;//vreme
    private int amount;//iznos
    
    private static int nTransactions = 0;
    
    public Transaction(int amount){
        this.amount = amount;
        nTransactions++;
        id = nTransactions;//avtomatski ke go kreirame personnumerot
        timeStamp = new Date();
    }
    
    @Override
    public String toString(){
        return timeStamp + " [" + id + "] " + amount;
    }
    
    public abstract void print(); 
}
