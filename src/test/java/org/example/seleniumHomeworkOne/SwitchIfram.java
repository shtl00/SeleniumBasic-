package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class SwitchIfram {
    WebDriver driver;
    @Before
    public void setUpBrowser(){
        WebDriverManager.chromedriver().setup();
      }
    @Test
    public void switchToIfram() throws InterruptedException {
        driver.manage().window().maximize();
        driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        //https://www.letskodeit.com/courses

       // driver.switchTo().frame("https://www.letskodeit.com/courses");

        WebElement iframe=driver.findElement(By.id("courses-iframe"));

        driver.switchTo().frame(1);
        Thread.sleep(300);
        driver.findElement(By.id("search")).sendKeys("Python");
        Thread.sleep(3000);


    }
    @After
    public void closeTest(){
        driver.close();

    }
}
