package automation.testsuite;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class LoginTest extends CommonBase {
    @BeforeMethod
    public void openBrowserTest(){
        driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
    }

    @Test
    public void locatedById () {
        WebElement textUsername = driver.findElement(By.id("txtLoginUsername"));
        System.out.println("Username element is: " +textUsername);

        WebElement textPassword = driver.findElement(By.id("txtLoginPassword"));
        System.out.println("Password element is: " +textPassword);
    }
    @Test
    public void locatedByName () {
        WebElement textUsername = driver.findElement(By.name("txtLoginUsername"));
        System.out.println("Username element is: " +textUsername);

        WebElement textPassword = driver.findElement(By.name("txtLoginPassword"));
        System.out.println("Password element is: " +textPassword);
    }
    @Test
    public void locatedByClassName(){
        WebElement btnFaceBook = driver.findElement(By.className("btn_face"));
        System.out.println("Button Facebook element is: " +btnFaceBook);
    }
    @Test
    public void locatedByLinkTest (){
        WebElement linkQuenMatKhau = driver.findElement(By.linkText("Quên mật khẩu?"));
        System.out.println("Link Quen mat khau: " +linkQuenMatKhau);

        WebElement linkGiangVien = driver.findElement(By.partialLinkText("giảng viên"));
        System.out.println("Link Dang nhap cho giang vien: " +linkGiangVien);
    }
    @Test
    public void locatedByClassName1 (){
        WebElement textInput = driver.findElement(By.className("input-label"));
        System.out.println(textInput);
    }
}