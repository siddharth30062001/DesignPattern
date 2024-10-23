package singletondesignpattern;

public class SingeltonLazyDesign {

    public static void main(String[] args) {

        Demo obj = Demo.getDemoInstance();
        Demo obj2 = Demo.getDemoInstance();
        System.out.println(obj2);
        
    }
    
}

class Demo{

    static Demo obj;

    private Demo(){

        System.out.println("Instance Created");
    }

    public static Demo getDemoInstance(){

        if(obj == null){
        obj=new Demo();
        }
        return obj;
    }

}
