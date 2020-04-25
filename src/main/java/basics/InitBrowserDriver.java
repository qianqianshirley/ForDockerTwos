package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class InitBrowserDriver {
    public static WebDriver initDriver(){
    String driverPath = "src\\drivers\\chromedriver.exe";
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver",driverPath);
    driver = new ChromeDriver();
    return driver;
}
}
