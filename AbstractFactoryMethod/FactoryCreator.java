package AbstractFactoryMethod;

public class FactoryCreator {

    public static AbstractFactory getChoice(String choice){
        if(choice.equals("Bank")){
            return new BankFactory();
        }
        else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }

        System.out.println("Enter the correct choice");
        return null;
    }
    
}
