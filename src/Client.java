import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank b = new Bank("Fb","bei",5);
        
        b.addAccount(new SvaingsAccount(1,500,6000));
        b.addAccount(new CheckingAccount(2,300,3600,20));
        b.addAccount(new SvaingsAccount(3,400,7000));
        b.addAccount(new CheckingAccount(4,200,2600,10));
        
        double totalb = 0;
        for(SvaingsAccount acc : b.getAllSavingAccounts())
            totalb += acc.getBalance();
        System.out.println("Enter an overdraftLimit:");
        double odf = scan.nextDouble();
        
        CheckingAccount ca = b.findAccount(odf);
        if(ca != null)
            System.out.println("Account Found " + ca);
        else
            System.out.println("No Account Found");
        
        System.out.println(b.toString());
        
        
    }
}