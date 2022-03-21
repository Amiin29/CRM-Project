package TestCases.Login;
import Connexion.Base;
import Login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Login_Successful extends Base {
    @Test
    public static void LoginSucessful() throws InterruptedException {
        Login log = new Login();
        driver.get(BaseURL); // URL DE SITE WEb
        log.GoToLogin(driver);
        Thread.sleep(4000);
        log.SetUser(driver,"amin29.miladi@gmail.com");
        log.SetPassword( driver,"Amin29638737");
        log.SetButton(driver);

        try{
            Assert.assertEquals(driver.switchTo().frame("Twitter settings iframe"),"Twitter settings iframe");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("----Error Test ----");
        }
        System.out.println("----Test Passed----");
    }

}
