package TestCases.Login;
import Connexion.Base;

import Login.Login;
import org.testng.annotations.Test;

public class LoginFailed_EmptyPassword extends Base{
    @Test
    public static void LoginFailed_EmptyEmail() throws InterruptedException {
        Login log = new Login();
        driver.get(BaseURL); // URL DE SITE WEb
        log.GoToLogin(driver);
        Thread.sleep(4000);
        log.SetUser(driver,"amin29.miladi@gmail.com");
        log.SetPassword( driver,"");
        log.SetButton(driver);
    }
}
