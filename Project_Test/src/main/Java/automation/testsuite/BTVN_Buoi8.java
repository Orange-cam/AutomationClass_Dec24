package automation.testsuite;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class BTVN_Buoi8 extends CommonBase {
    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser("https://automationfc.github.io/basic-form/index.html");
    }
    @Test
    public void locatedByID () {
        WebElement textboxName = driver.findElement(By.id("name"));
        System.out.println ("Textbox Name element is: "+textboxName);
    }
    @Test
    public void locatedByName () {
        WebElement textboxAddress = driver.findElement(By.name("address"));
        System.out.println ("Textbox Address element is: "+textboxAddress);
    }
    @Test
    public void locatedByTagName () {
        WebElement textboxEmail = driver.findElement(By.tagName("input"));
        System.out.println ("Textbox Email element is: "+textboxEmail);
    }
    @Test
    public void locatedByID_ForPassword () {
        WebElement textboxPassword = driver.findElement(By.id("password"));
        System.out.println ("Textbox Password element is: "+textboxPassword);
    }
}