package task.validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckboxesUI;

public class IsChecked {

    public static boolean isChecked1(WebDriver webDriver){
        WebElement element = webDriver.findElement(CheckboxesUI.checkbox1);
        return element.isSelected();
    }
    public static boolean isChecked2(WebDriver webDriver){
        WebElement element = webDriver.findElement(CheckboxesUI.checkbox2);
        return element.isSelected();
    }
}
