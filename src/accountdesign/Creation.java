
package accountdesign;

public class Creation extends Transaction{
    
    public Creation(){
        super(0);//za da mozeme non-stop da kreirame novi transakcii
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " created");
    }
}
