package automation.testsuite;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class ThucHanhBuoi8 extends CommonBase {
    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser("https://selectorshub.com/xpath-practice-page/");
    }
    @Test
    public void locatedByName (){
        WebElement UserEmail = driver.findElement(By.name("email"));
        System.out.println("User Email element is: " +UserEmail);
    }
    @Test
    public void locatedByID () {
        WebElement Password = driver.findElement(By.id("pass"));
        System.out.println("Password element is: " +Password);
    }
    @Test
    public void locatedByClassName () {
        WebElement textCompany = driver.findElement(By.className("form-control"));
        System.out.println("Company element is: " +textCompany);
    }
    @Test
    public void locatedByTagName () {
        WebElement MobileNumber = driver.findElement(By.tagName("label"));
        System.out.println("Mobile Number element is: " +MobileNumber);
    }
}