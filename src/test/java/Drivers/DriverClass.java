package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverClass {

    private  WebDriver createNewChromeDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    private WebDriver createNewFirefoxDriver(){
       WebDriver driver = new FirefoxDriver();
        return driver;
    }

    private WebDriver createNewSafariDriver(){
       WebDriver driver = new SafariDriver();
        return driver;
    }


    private WebDriver createNewEdgeDriver(){
      WebDriver  driver = new EdgeDriver();
        return driver;
    }

    public WebDriver getChromeDriver() {
        return createNewChromeDriver();
    }

    public WebDriver getFirefoxDriver() {
        return createNewFirefoxDriver();
    }

    public WebDriver getSafariDriver() {
        return createNewSafariDriver();
    }

    public WebDriver getEdgeDriver() {
        return createNewEdgeDriver();
    }

}
