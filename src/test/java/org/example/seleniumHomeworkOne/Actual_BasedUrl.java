package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class Actual_BasedUrl {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver= new ChromeDriver();
        baseUrl="https://www.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void test(){
        String actualUrl=driver.getCurrentUrl();
        System.out.println(baseUrl);
        System.out.println(actualUrl);
        assertEquals(baseUrl,actualUrl);

        driver.findElements(By.id("bmwcheck"));
        driver.findElement(By.id("bmwcheck")).isSelected();

    }
}
