public class HomeLoanProcessing implements LoanProcessor {
    public void checkEligibility(){
        System.out.println("Checking Eligibility For HomeLoan");
    }
    public void computeEMI(){
        System.out.println("Computing EMI For HomeLoan");
    }
    public void computeInterest(){
        System.out.println("Computing Interest For HomeLoan");
    }
    public void info(){
        System.out.println("Something New...");
    }
}
