package Factory_AbstractPattern.AbstractPattern;

public abstract class PlatFormFactory {
    public static   PlatForm getPlatForm(String platForm){
        switch(platForm){
            case "ANDROID":
                return new Android();
             case "IOS":
                 return new IOS();
            default: throw new IllegalArgumentException("Invalid plat form " + platForm);
        }
    };
}
