public abstract class Account {
    int ano, bal;
    String name, accountType;
    
    public void setAccountDetails(int ano, String name, String atype, int bal){
        this.ano=ano; this.name=name; this.accountType=atype; this.bal=bal;
    }
    public void showAccountDetails(){
        System.out.println("Account Code  : "+ano);
        System.out.println("Customer Name : "+name);
        System.out.println("Account Type  : "+accountType);
        System.out.println("Balance Avail : "+bal);
        System.out.println("_________________________________________________");
        
    }
    
    public abstract void interestCalculation();
}
