
public class Bank {

    private String name;
    private String location;
    private Account[] accounts;

    public Bank(String name, String location, int size) {
        this.name = name;
        this.location = location;
        accounts = new Account[size];
    }

    public boolean addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] findAccounts(int id) {
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getId() == id) {
                count++;
            }
        }
        Account[] found = new Account[count];
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getId() == id) {
                found[i] = accounts[i];
            }
        }
        return found;
    }

    public int CountAllSavingAccounts() {
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof SvaingsAccount) {
                count++;
            }
        }
        return count;
    }

    public SvaingsAccount[] getAllSavingAccounts() {
        SvaingsAccount[] sa = new SvaingsAccount[CountAllSavingAccounts()];
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof SvaingsAccount && accounts[i] != null) {
                accounts[i] = sa[count];
                count++;
            }

        }
        return sa;
    }

    public CheckingAccount findAccount(double odf) {
        CheckingAccount[] caDraft = new CheckingAccount[accounts.length];
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof CheckingAccount && accounts[i] != null) {
                accounts[i] = caDraft[count];
                count++;
            }
        }
        for (int i = 0; i < caDraft.length; i++) {
            if (caDraft[i].getOverDraftLimit() == odf) {
                return caDraft[i];
            }
        }

        return null;
    }
    
    public String toString(){
        String s = "Bank name: " + name + "Bank location: " + location 
                + "/n" ;
        for(int i = 0; i<accounts.length; i++){
            s = accounts[i].toString() + "/n";
        }
        return s;
    }
}