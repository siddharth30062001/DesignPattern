package singletondesignpattern;

public class SingletonDesign {

    public static void main(String[] args) {

        ABC obj1=ABC.getInstance();
        // ABC obj2=ABC.getInstance();
        // System.out.println(obj1);
        System.out.println(obj1);
        
    }
    
}

class ABC{

    //making static object
    public static ABC obj=new ABC();

    //making private construtor
    private ABC(){

        System.out.println("Instance Created");  //To check
    }

    public static ABC getInstance(){ 

        return obj;
    }
}
