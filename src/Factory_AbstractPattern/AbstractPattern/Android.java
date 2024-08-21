package Factory_AbstractPattern.AbstractPattern;

public class Android extends PlatForm {

    @Override
    public UIComponentFactory createUiComponentFactory() {
        return new AndroidFactory();
    }
}
