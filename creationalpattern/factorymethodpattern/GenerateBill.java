package creationalpattern.factorymethodpattern;

import java.util.*;

abstract class Plan {
    
    protected double rate;

    public abstract void getRate();

    public  void generateBill(int unit){
        System.out.println(rate*unit);
    }
    
}

class DomesticPlan extends Plan{
    public void getRate(){
        rate=3.15;
    }
}

class InstitutionalPlan extends Plan{
    public void getRate(){
        rate=5.15;
    }
}

class CommericalPlan extends Plan{
    public void getRate(){
        rate=7.15;
    }
}

class GetPlanFactory{

    public Plan getPlan(String setPlan){
        if(setPlan==null){
            return null;
        }

        else if(setPlan.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }

        else if(setPlan.equalsIgnoreCase("InstitutionalPlan")){
            return new InstitutionalPlan();
        }

        else if(setPlan.equalsIgnoreCase("CommericalPlan")){
            return new CommericalPlan();
        }

        return null;

    }
}

public class GenerateBill {

    public static void main(String[] args) {

        GetPlanFactory gpf=new GetPlanFactory();
    
        Scanner sc=new Scanner(System.in);

        System.out.println("enter plan which you want to select: \n"+ 
        "DomesticPlan press 1\n"+
        "InstituionalPlan press 2 \n"+
        "CommericalPlan press 3"
        );
        Plan p;
        int select=sc.nextInt();
        switch (select) {
            case 1:
                p=gpf.getPlan("DomesticPlan");
                break;
            case 2:
               p=gpf.getPlan("InstitutionalPlan");
               break;    
        
            case 3:
               p=gpf.getPlan("CommericalPlan");
               break;

            default:
               p=gpf.getPlan("null");   

        }
    

        System.out.println("Enter the unit: ");
        int unit=sc.nextInt();
        
        //=gpf.getPlan(setplan);

        p.getRate();
        p.generateBill(unit);
        


        
    }

    
}