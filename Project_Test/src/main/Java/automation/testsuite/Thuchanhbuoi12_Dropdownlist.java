package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;

public class Thuchanhbuoi12_Dropdownlist extends CommonBase {
    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser(CT_PageURL.URL_CODESTAR);}

    @Test
    public void chooseAWSOption(){
        Select dropdownCourse =new Select(driver.findElement(By.id("product_categories_filter")));
        System.out.println("Tong item cua dropdownlist la: "+ dropdownCourse.getOptions().size());
        dropdownCourse.selectByContainsVisibleText("Kiểm thử");
        String textAfterSelect = dropdownCourse.getFirstSelectedOption().getText();
        System.out.println("Text is: "+ textAfterSelect);

        System.out.println("Is multiple: "+ dropdownCourse.isMultiple());
    }
}