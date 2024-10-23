package AbstractFactoryMethod;

public class LoanFactory extends AbstractFactory{

    @Override
    public Loan getLoan(String LoanType) {
        
        if(LoanType.equals("") || LoanType.equals(null)){
            return null;
        }
        else if(LoanType.equalsIgnoreCase("HomeLoan")){
            return new HomeLoan();
        }
        else if(LoanType.equalsIgnoreCase("EducationLoan")){
            return new EducationLoan();
        }
        else if(LoanType.equalsIgnoreCase("BusinessLoan")){
            return new BusinessLoan();
        }

        return null;
    }

    @Override
    public Bank getBank(String BankName) {
        
        return null;
    }
    
}
