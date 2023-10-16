package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class DisplayedExample {
    WebDriver driver;
    String baseURL="https://www.letskodeit.com/practice";
    @Before
    public void setupChrome(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }
    @Test
    public void isDisplayedTest() throws InterruptedException {

        driver.findElement(By.id("show-textbox")).click();
        Boolean isDisplayed=driver.findElement(By.id("displayed-text")).isDisplayed();
        System.out.println(isDisplayed);
       assertTrue(isDisplayed);
       driver.findElement(By.id("displayed-text")).sendKeys("Sheetal");
       Thread.sleep(5000);


    }
    @After
    public void CloseTest(){
        driver.close();
    }
}
