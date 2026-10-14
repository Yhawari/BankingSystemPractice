

public class CheckingAccount extends Account{
    private double overDraftLimit;
    
    public CheckingAccount(int id, double balance , double air, double odf){
        super(id,balance,air);
        this.overDraftLimit = odf;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    
    @Override
    public void withdraw(double w){
        if(getBalance() - w < overDraftLimit)
            System.out.println("Denied");
        else
            setBalance(getBalance() - w);
    }
    
    
}
