package task.validations;

import org.openqa.selenium.WebDriver;
import actions.WaitUntilElement;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;

public class IsLoginSuccessMessage {

    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, FormAuthentication.alertSuccess);
    }

    public static String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAuthentication.alertSuccess);
        return element.getText();
    }

    public static boolean logoutVisible(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, FormAuthentication.logoutButton);
    }
}
