package Factory_AbstractPattern.AbstractPattern;

import Factory_AbstractPattern.AbstractPattern.Button.AndroidButton;
import Factory_AbstractPattern.AbstractPattern.Button.Button;
import Factory_AbstractPattern.AbstractPattern.CheckBox.AndroidCheckBox;
import Factory_AbstractPattern.AbstractPattern.CheckBox.CheckBox;

public class AndroidFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new AndroidCheckBox();
    }
}
