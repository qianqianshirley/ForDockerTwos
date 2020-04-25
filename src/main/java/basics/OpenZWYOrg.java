package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;



public class OpenZWYOrg {
  WebDriver driver = InitBrowserDriver.initDriver();

    public void login() {

          driver.get("http://www.kdzwy.com/");
          WebDriverWait wdw = new WebDriverWait(driver,8);//seconds level
       // final WebElement 管家登录 = wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("oldLogin"))); 
         wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("oldLogin")));//only this condition is meet will go to next line
          WebElement oldLogin = driver.findElement(By.id("oldLogin"));
          oldLogin.click();
              }
    }

