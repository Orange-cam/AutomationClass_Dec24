package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import java.util.List;

public class ThucHanhBuoi12 extends CommonBase {
    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser(CT_PageURL.URL_DEMOQA);}

    @Test
    public void clickOnCheckBox() {
        WebElement checkBoxSport= driver.findElement(By.xpath("//label[text()='Sports']"));
        if (checkBoxSport.isSelected()==false) {
            checkBoxSport.click();
            System.out.println("Checkbox sport has clicked");
        }
        WebElement checkBoxReading=driver.findElement(By.xpath("//label[text()='Reading']"));
        if (checkBoxReading.isSelected()==false) {
            checkBoxReading.click();
            System.out.println("Checkbox reading has clicked");
        }
    }
    @Test
    public void clickMultiple() {
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
        for (WebElement checkbox : listCheckbox){
            checkbox.click();
        }
    }

    @Test
    public void clickRadioButoon(){
        WebElement radioMale = driver.findElement(By.xpath("//label[text()='Male']"));
        //1. Kiem tra default data cua radioMale la chua click
        boolean isClickMale = radioMale.isSelected();
        System.out.println("Radio Male is clicked"+ isClickMale);
        //2.Kiem tra radio Male enable khi click
        if(radioMale.isEnabled() ==true)
        {
            radioMale.click();
        }
    }

    //@AfterTest
    public void closeBrowser () {
        driver.close();
    }

    }
