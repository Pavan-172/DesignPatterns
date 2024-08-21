package Factory_AbstractPattern.AbstractPattern;

import Factory_AbstractPattern.AbstractPattern.Button.Button;
import Factory_AbstractPattern.AbstractPattern.Button.IOSButton;
import Factory_AbstractPattern.AbstractPattern.CheckBox.CheckBox;
import Factory_AbstractPattern.AbstractPattern.CheckBox.IOSCheckBox;

public class IOSFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
     return new IOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IOSCheckBox();
    }

}
