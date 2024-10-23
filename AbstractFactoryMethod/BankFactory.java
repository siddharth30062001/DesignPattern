package AbstractFactoryMethod;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String BankName) {
        
        if(BankName.isEmpty()){
            return null;
        }
        else if(BankName.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }

        else if(BankName.equalsIgnoreCase("IDFC")){
            return new IDFC();
        }

        else if(BankName.equalsIgnoreCase("SBI")){
             return new SBI();
        }

        return null;
    }

    @Override
    public Loan getLoan(String LoanType) {
        
        return null;
    }

    
}
