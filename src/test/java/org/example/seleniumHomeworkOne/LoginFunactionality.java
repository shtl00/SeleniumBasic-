package org.example.seleniumHomeworkOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

public class LoginFunactionality {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager drive = new ChromeDriverManager();
        driver.manage().window().maximize();
        driver.get("https://www.zara.com/uk/");


    }
}
