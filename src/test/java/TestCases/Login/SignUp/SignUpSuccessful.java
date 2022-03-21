package TestCases.Login.SignUp;

import Connexion.Base;
import SignUp.SignUp;
import org.testng.annotations.Test;

public class SignUpSuccessful  extends Base {
    @Test
    public static void SignUpSuccessful() throws InterruptedException {
        SignUp Sign = new SignUp();
        Sign.setBuster();
    }
}

/*
--------------------------------------------
package TestCases.Login.SignUp;

import Connexion.Base;
import SignUp.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpSuccessful  extends Base {
    @Test
    public static void SignUpSuccessful() throws InterruptedException {
        SignUp Sign = new SignUp();
      driver.get("https://api.cogmento.com/register/");
        Thread.sleep(4000);// URL DE SITE WEb
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("iframe[src^='https://www.google.com/recaptcha/api2/bframe?hl=en&v=_exWVY_hlNJJl2Abm8pI9i1L&k=6LdcFyMUAAAAANRcXSdiVCoABrGE1I0IB7vakpaM']")));
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("span#recaptcha-anchor"))).click();
        //driver.findElement(By.className("g-c-R  webstore-test-button-label")).click();
        //Sign.GoToLogin(driver);
        //Thread.sleep(4000);
        //Sign.GoToSignUp(driver);
       // Sign.SetEmail(driver,"amin29.miladi@gmail.com");

       // Sign.SetNumber(driver,"29638737");
       // Sign.SetCheckbox1(driver);
      //  Thread.sleep(4000);

       // Sign.SetCaptcha(driver);

    }
}
*/