package Services;

import DriverManager.ObjectClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginServices {

    public void onLoginPage(WebDriver obj) {
        obj.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUsernamePassword(String id, String pass, WebDriver obj) {
        obj.findElement(By.xpath("//div[@id='form']//div[1]//input[1]")).sendKeys(id);
        obj.findElement(By.xpath("//div[@id='form']//div[2]//input[1]")).sendKeys(pass);
    }

    public void clickButton(WebDriver obj) {
        obj.findElement(By.id("submit")).click();
    }

    public void checkUserNavigation(WebDriver obj) {
        Assert.assertEquals("check for text", "Logged In Successfully | Practice Test Automation", obj.getTitle());
        obj.close();
    }
}
