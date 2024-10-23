package AbstractFactoryMethod;

public abstract class AbstractFactory {
    
    public abstract Bank getBank(String BankName);
    public abstract Loan getLoan(String LoanType);
}
