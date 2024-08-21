package Factory_AbstractPattern.AbstractPattern;

public class IOS extends PlatForm{


    @Override
    public UIComponentFactory createUiComponentFactory() {
        return new IOSFactory();
    }
}
