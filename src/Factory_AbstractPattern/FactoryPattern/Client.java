package Factory_AbstractPattern.FactoryPattern;

public class Client {
        public static void main(String[] args) {
            UIComponentFactory uiComponentFactory = PlatFormFactory.getPlatForm(PlatFormType.IOS);
            uiComponentFactory.create();
        }
}

