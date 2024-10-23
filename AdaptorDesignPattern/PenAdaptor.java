package AdaptorDesignPattern;

public class PenAdaptor implements Pen{

    PilotPen pp=new PilotPen();

    @Override
    public void write(String s){

        pp.write(s);
    }
    
}
