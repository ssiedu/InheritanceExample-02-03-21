public interface LoanProcessor {
    //here we are going to define the specification of a LoanProcessingClass
    void checkEligibility();
    void computeEMI();
    void computeInterest();
}
