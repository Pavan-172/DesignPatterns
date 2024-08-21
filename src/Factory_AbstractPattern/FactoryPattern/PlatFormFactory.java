package Factory_AbstractPattern.FactoryPattern;

public class PlatFormFactory {
    public static UIComponentFactory getPlatForm(PlatFormType platFormType ) {
            switch (platFormType){
                case PlatFormType.ANDROID: return new Android();
                case PlatFormType.IOS: return new IOS();
                default: throw new IllegalArgumentException("Unknown Platform Type "+ platFormType);
            }

    };

}
