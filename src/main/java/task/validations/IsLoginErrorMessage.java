package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;

public class IsLoginErrorMessage {

    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, FormAuthentication.alertSuccess);
    }

    public static String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAuthentication.alertSuccess);
        return element.getText();
    }
}
