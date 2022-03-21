package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
public class SignUp {
    public void GoToLogin(WebDriver driver){
        driver.findElement(By.cssSelector("div.navbar.navbar-default.navbar-fixed-top.skrollable.skrollable-between:nth-child(2) div.container div.collapse.na" +
                "vbar-collapse ul.nav.navbar-nav.navbar-right li:nth-child(2) > a:nth-child(1)")).click();
    }

    public void GoToSignUp(WebDriver driver){
        driver.findElement(By.xpath("//a[@href='https://api.cogmento.com/register']")).click();
    }

    public void  SetEmail(WebDriver driver,String Email){
        driver.findElement(By.name("email")).sendKeys(Email);
    }

    public void  SetNumber(WebDriver driver,String Number){

        driver.findElement(By.name("phone")).sendKeys(Number);
    }

    public void  SetCheckbox1(WebDriver driver){
        driver.findElement(By.id("terms")).click();
    }

    public void  SetCaptcha(WebDriver driver) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        new WebDriverWait(driver, 100).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(driver, 200).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border"))).click();


    }

    public void  setBuster() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MILADI\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");

        options.addExtensions(new File("C:\\Users\\MILADI\\Downloads\\mpbjkejclgfgadiemmefgebjfooflfhl.crx"));

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        options.merge(capabilities);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://classic.freecrm.com/index.html");
        this.GoToLogin(driver);
        Thread.sleep(4000);
        this.GoToSignUp(driver);
        this.SetEmail(driver,"amin29.miladi@gmail.com");

        this.SetNumber(driver,"29638737");
        Thread.sleep(4000);

        this.SetCheckbox1(driver);
        Thread.sleep(4000);

        this.SetCaptcha(driver);
        //Thread.sleep(4000);
        //driver.findElement(By.linkText("chrome-extension://mpbjkejclgfgadiemmefgebjfooflfhl/src/solve/solver-button.css"));
       // driver.findElement(By.cssSelector("body:nth-child(2) > div.ui.middle.aligned.center.aligned.grid:nth-child(1)")).click();
    }

    public void GOTo(WebDriver driver1){
        driver1.get("https://classic.freecrm.com/index.html");
        driver1.findElement(By.id("solver-button")).click();

    }
}















        /*ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\MILADI\\Downloads\\mpbjkejclgfgadiemmefgebjfooflfhl.crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver.manage().window().maximize();
        System.out.println("Opening extension");
        driver.get("https://chrome.google.com/webstore/detail/buster-captcha-solver-for/mpbjkejclgfgadiemmefgebjfooflfhl/related?ucbcb=1");
*/
///ChromeDriver driver = new ChromeDriver(options);
// options.addExtensions(new File("C:\\Users\\MILADI\\Downloads\\mpbjkejclgfgadiemmefgebjfooflfhl.crx"));
// DesiredCapabilities cap = DesiredCapabilities.chrome();

//ChromeDriver driver2= new ChromeDriver(options);
// driver.get("chrome://extensions/");