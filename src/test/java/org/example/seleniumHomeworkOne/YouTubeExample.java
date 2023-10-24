package org.example.seleniumHomeworkOne;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.seleniumHomeworkOne.LoginFunactionality.driver;
public class YouTubeExample {
    @Before
    public void setUpChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
    }

    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[6]/div[1]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();//driver.findElement(By.id("search-form")).click();
        driver.findElement(By.id("search-input")).click();
        Thread.sleep(2000);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Dhuni re dhakhavi");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"Dhuni Re Dhakhavi | Sachin-Jigar| Sachin Sanghvi | Nishant Thacker\"]")).click();
        Thread.sleep(10000);
    }
    @After
    public void testClose(){
        driver.close();
    }
}