package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Practise {
    WebDriver driver;
    String baseURL="https://www.letskodeit.com/practice";
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
    @Test
    public void enabledTest() throws InterruptedException {
        driver.findElement(By.id("enabled-button")).click();
        Boolean isTextInputboxEnabled=driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println(isTextInputboxEnabled);
        assertTrue(isTextInputboxEnabled);
        Thread.sleep(1000);
        driver.findElement(By.id("enabled-example-input")).sendKeys("My Name is Brita.");
        Thread.sleep(5000);
        String myActualURL=driver.getCurrentUrl();
        System.out.println(myActualURL);
        System.out.println(baseURL);
        assertEquals(baseURL,myActualURL);


    }
    @Test
    public void disabledTest(){
        driver.findElement(By.id("disabled-button")).click();
        Boolean isTextInputboxDisabled=driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println(isTextInputboxDisabled);
        assertFalse(isTextInputboxDisabled);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
