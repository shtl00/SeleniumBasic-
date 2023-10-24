package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Practise {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }
    @Test
    public void findElementsPractise(){
       List<WebElement> myListOfElement= driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        System.out.println("my list"+ myListOfElement);
        System.out.println(myListOfElement.size());
        for (WebElement myElement:myListOfElement){
            String myText=myElement.getText();
            System.out.println(myText);
        }

    }

    @After
    public void tearDown(){
        driver.close();
    }

}
