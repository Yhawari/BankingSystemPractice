

public class SvaingsAccount extends Account {
    public SvaingsAccount(int id, double balance, double air){
        super(id,balance, air);
    }
    
    @Override
    public void withdraw(double w){
        if(w > getBalance())
            System.out.println("Denied");
        else
            setBalance(getBalance() - w);
    }
}