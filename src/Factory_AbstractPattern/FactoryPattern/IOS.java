package Factory_AbstractPattern.FactoryPattern;

public class IOS implements UIComponentFactory {


    @Override
    public void create(){
        System.out.println("IOS created");
    };
}
