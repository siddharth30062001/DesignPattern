package AbstractFactoryMethod;

public abstract class Loan {
    
    protected double rate;
    public abstract void getInterestRate(double rate);

    public void calculateLoan(double loanamount,int years){

        double EMI;  

        int n;  
 
        n=years*12;  
        rate=rate/1200;  
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
 
        System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanamount+" you have borrowed");

    }
}

class HomeLoan extends Loan{

    @Override
    public void getInterestRate(double r) {
        
        rate=r;
    }
}

class EducationLoan extends Loan{

    @Override
    public void getInterestRate(double r) {
       
        rate=r;
        
    }
}

class BusinessLoan extends Loan{

    @Override
    public void getInterestRate(double r) {
       
        rate=r;
        
    }
}
