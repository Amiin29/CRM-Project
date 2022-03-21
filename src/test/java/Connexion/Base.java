package Connexion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {
    public static String BaseURL="https://classic.freecrm.com/index.html";
    public static WebDriver driver;
    //driver.manage().window().maximize();

    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MILADI\\Downloads\\chromedriver.exe");
        driver= new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }
}
