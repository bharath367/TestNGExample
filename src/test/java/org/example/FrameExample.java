package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FrameExample {


    ChromeDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();
    }

    @Test
    void farmemethod() {
        driver.switchTo().frame("mce_0_ifr");
        WebElement e = driver.findElement(By.id("tinymce"));
        e.clear();
        e.sendKeys("Bharath simha Reddy");
    }

}
//    @AfterClass
//    void closeDriver(){
//        driver.close();
//    }
