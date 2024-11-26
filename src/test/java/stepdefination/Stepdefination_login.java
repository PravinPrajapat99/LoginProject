package stepdefination;

import DriverManager.ObjectClass;
import Services.LoginServices;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class Stepdefination_login {
    ObjectClass obj =ObjectClass.createObject();
    ObjectClass obj2=ObjectClass.createObject();

    WebDriver driver =obj.getChromeDriver();
    LoginServices services=new LoginServices();

    @Given("user is on login")
    public void user_is_on_login() throws InterruptedException {
        System.out.println(obj);
        System.out.println(obj2);
       services.onLoginPage(driver);
    }

    @When("user enter {string} {string}")
    public void user_enter_id_pass(String id,String pass) throws InterruptedException {
        services.enterUsernamePassword(id,pass,driver);
    }

    @When("click login button")
    public void click_login_button() {
        services.clickButton(driver);

    }

    @Then("user is navigeted to login page")
    public void user_is_navigeted_to_login_page() throws InterruptedException {
        services.checkUserNavigation(driver);

    }

}
