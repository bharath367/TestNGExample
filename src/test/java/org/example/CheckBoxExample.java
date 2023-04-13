package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxExample{


    ChromeDriver driver;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();
    }

    @Test
    void CheckBoxMedthod() {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,360)","" );


        driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Music']")).click();

    }

}
//    @AfterClass
//    void closeDriver(){
//        driver.close();
//    }
