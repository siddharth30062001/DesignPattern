package AdaptorDesignPattern;

public class School {

    public static void main(String[] args) {
        
        Assignment aw=new Assignment();
        Pen p=new PenAdaptor();
        aw.setPen(p);
        aw.writeAssignment("I am tired! of writing the assignment");

    }
    
}
