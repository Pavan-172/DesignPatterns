package Factory_AbstractPattern.AbstractPattern;

import Factory_AbstractPattern.AbstractPattern.Button.Button;
import Factory_AbstractPattern.AbstractPattern.CheckBox.CheckBox;

public interface UIComponentFactory {
    Button createButton();
    CheckBox createCheckBox();
}
