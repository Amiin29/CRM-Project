package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    public void GoToLogin(WebDriver driver){
        driver.findElement(By.cssSelector("div.navbar.navbar-default.navbar-fixed-top.skrollable.skrollable-between:nth-child(2) div.container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void SetUser(WebDriver driver,String username){
        driver.findElement(By.name("email")).sendKeys(username);
    }
    public void SetPassword(WebDriver driver,String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }
    public void SetButton(WebDriver driver){
        driver.findElement(By.cssSelector("body:nth-child(2) > div.ui.middle.aligned.center.aligned.grid:nth-child(1)")).click();
    }

}
