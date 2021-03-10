
public class BankingApp {

    public static void main(String[] args) {

                 
        Account ac1=new SavingAccount();
        ac1.setAccountDetails(111, "AAA", "Saving", 10000);
        
        Account ac2=new CurrentAccount();
        ac2.setAccountDetails(112, "BBB", "Current", 10000);
        
        ac1.showAccountDetails();
        ac2.showAccountDetails();
        
        ac1.interestCalculation();
        ac2.interestCalculation();
        
    }
}
