import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInsertRate;
    private Date dateCreated;
    
    public Account(){
        id =0;
        balance =0;
        annualInsertRate = 0;
    }
    
    public Account(int id, double b, double air){
        this.annualInsertRate = air;
        this.balance =b;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInsertRate() {
        return annualInsertRate;
    }

    public void setAnnualInsertRate(double annualInsertRate) {
        this.annualInsertRate = annualInsertRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public double getMonthlyInsertRate(){
        return annualInsertRate/12;
    }
    
    public double getMonthlyInsert(){
        return balance * getMonthlyInsertRate()/100;
    }
    
    public void withdraw(double w){
        if(balance < w)
            System.out.println("Amount not found");
        else
            balance -= w;
        
    }
    
    public double deposit(double d){
        return balance += d;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", annualInsertRate=" + annualInsertRate + ", dateCreated=" + dateCreated + '}';
    }
    
    
}