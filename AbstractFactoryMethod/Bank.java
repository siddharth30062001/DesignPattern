package AbstractFactoryMethod;


public interface Bank {

     String getBankName();
    
}

class HDFC implements Bank{

    private final String BankName;

    HDFC(){
        BankName="HDFC";
    }
    @Override
    public String getBankName() {
        
        return BankName;
    }
}

class IDFC implements Bank{
    private final String BankName;

    IDFC(){
        BankName="IDFC";
    }

    @Override
    public String getBankName() {
        
        return BankName;
    }
}

class SBI implements Bank{
    private final String BankName;

    SBI(){
        BankName="SBI";
    }

    @Override
    public String getBankName() {
        
        return BankName;
    }
}
