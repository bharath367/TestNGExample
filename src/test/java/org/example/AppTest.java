package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest {

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Opening Browser");
    }
    @Test(priority = 2 )
    void clickUMS() {
        System.out.println("Clicking on UMS");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 3)
    void openHomePage() {
        System.out.println("Opening HomePage");
    }

    @Test(priority = 4,enabled = false)
    void closeUMS() {
        System.out.println("closing UMS");
    }

    @Test(priority = 5)
    void closeBrowser() {
        System.out.println("Closing Browser");
    }
}
