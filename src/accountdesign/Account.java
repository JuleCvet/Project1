
package accountdesign;
import java.util.ArrayList;

public class Account {//shto sodrzi sekoja bankovna smetka
    private String owner;//sekoj moze da ja kreira- public, so get.owner() - najdolu
    private int balance;//ima owner,personnummer i balance i lista na transakcii
    private int number;//bankoven broj na kreiranje poveke smetki za eden korisnik
    
    ArrayList<Transaction> transactions;//sekoj si ima svoja lista na transakcii
    
    private static int nAccounts = 0;//broj na transakcii
    
    public Account(String owner){//konstruktor
        this.owner = owner;//so this - znaeme deka e string varijablata owner
        balance = 0;//sekoj balanse na pocetok go setirame na 0
        nAccounts++;//gi setirame avtomatski rednite broevi na sekoja nova acount 
        number = nAccounts;//
        transactions = new ArrayList<>();//ja setirame listata vo public i i dodeluvame value
        transactions.add(new Creation());//so nova subklasa metod t.s konstruktor-
    }//dodavame nova kreacija na transakcija za site klienti
    
    public void deposit(int amount){
        balance = balance + amount;
        transactions.add(new Deposit(amount));
    }//vo transakciite posle sekoe koristenje na ovoj metod, dodavame nova transakcija
    
    public void withdraw(int amount){
        if (amount <= balance) {
            balance = balance - amount;
            transactions.add(new Withdrawal(amount));//isto i ovde dodavame nova transakcija
        } else {
            System.out.println("not enough money");
        }
    }
    
    public void transferTo(int amount, Account other){
        if (amount <= balance) {
            this.balance = this.balance - amount;//odzemame
            other.balance = other.balance + amount;//dodavame na nov account
            this.transactions.add(new TransferTo(amount, other));//extra transakcija za this.balance
            other.transactions.add(new TransferFrom(amount,this));//extra transakcija za other
        } else {
            System.out.println("not enough money");
        }
    }
    
    public void printAll(){//prvo ni printa informacii cija cmetka e a potoa site transakcii
        System.out.println(number + "/" + owner + ": " + balance);
        System.out.println("Transaction:");
        for(Transaction t  : transactions){
            t.print();
        }
    }
     
    public String getOwner() {
        return owner;
    }  
}
