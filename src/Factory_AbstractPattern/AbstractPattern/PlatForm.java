package Factory_AbstractPattern.AbstractPattern;


public abstract class PlatForm {

    public abstract UIComponentFactory createUiComponentFactory();

    public static PlatForm getPlatForm(String platForm) {
        return PlatFormFactory.getPlatForm(platForm);
    }
}
