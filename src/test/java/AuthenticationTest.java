import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;

public class AuthenticationTest extends BaseTest {

    @Test
    public void authenticationSuccessTest(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver), "You logged into a secure area!\n×");
        Assert.assertTrue(IsLoginSuccessMessage.logoutVisible(webDriver));
    }

    @Test
    public void authenticationFailedTest(){
        Login.as(webDriver,"123","SuperSecretPassword!");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
        //Assert.assertEquals(IsLoginErrorMessage.getTextSuccess(webDriver), "You logged into a secure area!\n×");
    }
}
