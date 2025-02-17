package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;

public class BTVN_Buoi12 extends CommonBase {
    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser(CT_PageURL.URL_GLOBALSQA);
    }

    @Test
    public void chooseVietNamOption() {
        Select dropdownCourse = new Select(driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/descendant::select")));
        System.out.println("Tong item cua dropdownlist la: " + dropdownCourse.getOptions().size());
        dropdownCourse.selectByContainsVisibleText("Viet Nam");
        String textAfterSelect = dropdownCourse.getFirstSelectedOption().getText();
        System.out.println("Text is: " + textAfterSelect);

        System.out.println("Is multiple: " + dropdownCourse.isMultiple());
    }

    //@AfterTest
    public void closeBrowser() {
        driver.close();
    }
}