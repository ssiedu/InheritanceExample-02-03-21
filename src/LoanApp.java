
public class LoanApp {

    public static void main(String[] args) {

        LoanProcessor loan;
        
        //loan=new HomeLoanProcessing();
        loan=new TwoWheelerLoan();
        loan.checkEligibility();
        loan.computeEMI();
        loan.computeInterest();
        
    }
}
