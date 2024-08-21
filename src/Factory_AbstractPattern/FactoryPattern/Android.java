package Factory_AbstractPattern.FactoryPattern;

public class Android implements UIComponentFactory{


    @Override
    public void create(){
        System.out.println("Android created");
    };
}
