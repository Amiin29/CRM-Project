package TestCases.Login;
import Login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Connexion.Base;
public class LoginFailed_PassNotValid extends Base{
    @Test
public static void LoginFailedPassNotValid() throws InterruptedException {
            Login log = new Login();
            driver.get(BaseURL); // URL DE SITE WEb
            log.GoToLogin(driver);
            Thread.sleep(4000);
            log.SetUser(driver,"amin29.miladi@gmail.com");
            log.SetPassword( driver,"amin29638737");
            log.SetButton(driver);
            WebElement actualErrorMessage = driver.findElement(By.className("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]"));
        try{
            Assert.assertEquals(driver.getTitle(),"Cogmento CRM");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("----Test Passed----");
    }
    }



