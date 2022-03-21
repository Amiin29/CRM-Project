package TestCases.Login;
import Connexion.Base;
import Login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailed_EmptyEmail extends Base{
    @Test
    public static void LoginFailed_EmptyEmail() throws InterruptedException {
        Login log = new Login();
        driver.get(BaseURL); // URL DE SITE WEb
        log.GoToLogin(driver);
        Thread.sleep(4000);
        log.SetUser(driver,"");
        log.SetPassword( driver,"amin29638737");
        log.SetButton(driver);
    }
}
