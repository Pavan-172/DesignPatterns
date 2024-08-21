package Factory_AbstractPattern.AbstractPattern;

import Factory_AbstractPattern.AbstractPattern.Button.Button;
import Factory_AbstractPattern.AbstractPattern.CheckBox.CheckBox;

public class Client {
    public static void main(String[] args) {
    PlatForm platForm = PlatForm.getPlatForm("IOS");
    UIComponentFactory uiComponentFactory = platForm.createUiComponentFactory();
    Button button = uiComponentFactory.createButton();
    CheckBox checkBox = uiComponentFactory.createCheckBox();
    button.render();
    checkBox.render();
    }
}
