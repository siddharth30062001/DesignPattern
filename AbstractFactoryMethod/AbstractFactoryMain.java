package AbstractFactoryMethod;

import java.util.Scanner;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the choice: ");
        String choice=sc.next();
        
        if(choice.equals("Bank")){
        AbstractFactory af=FactoryCreator.getChoice(choice);
        System.out.println("enter the bank name: ");
        String selectBank=sc.next();
        Bank b= af.getBank(selectBank);

        System.out.println("Bank you selected: "+b.getBankName());

        }
        
        else if(choice.equals("Loan")){
        AbstractFactory afl=FactoryCreator.getChoice(choice);
        System.out.println("enter the Loan Type: ");
        String loanType=sc.next();
        System.out.println("enter the rateOfinterest");
        double rate=sc.nextDouble();
        Loan lo= afl.getLoan(loanType);
        lo.getInterestRate(rate);
        lo.calculateLoan(500000, 7);
        }

        else{
            System.out.println("You select wrong choice \nPlease select Loan or Bank");
        }




    
    }
    
}
