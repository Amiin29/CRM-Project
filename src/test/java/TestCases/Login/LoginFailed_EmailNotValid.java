package TestCases.Login;
import Connexion.Base;
import Login.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailed_EmailNotValid extends Base{
    @Test
    public static void LoginFailed_EmailNotValid() throws InterruptedException {
        Login log = new Login();
        driver.get(BaseURL); // URL DE SITE WEb
        log.GoToLogin(driver);
        Thread.sleep(4000);
        log.SetUser(driver,"amin29.miladigmail.com");
        log.SetPassword( driver,"Amin29638737");
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
