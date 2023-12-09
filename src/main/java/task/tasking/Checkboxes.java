package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.CheckboxesUI;
import ui.HomePageUI;

public class Checkboxes {

    public static void as(WebDriver webDriver){
        Click.on(webDriver,HomePageUI.checkBoxes);
        Click.on(webDriver, CheckboxesUI.checkbox1);
        Click.on(webDriver, CheckboxesUI.checkbox2);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Checkboxes Test");

    }
}
