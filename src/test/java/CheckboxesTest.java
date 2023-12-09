import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Checkboxes;
import task.validations.IsChecked;

public class CheckboxesTest extends BaseTest {

    @Test
    public void CheckboxesTest(){
        Checkboxes.as(webDriver);
        Assert.assertTrue(IsChecked.isChecked1(webDriver));
        Assert.assertFalse(IsChecked.isChecked2(webDriver));
    }
}
