package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void  login(){
        System.out.println("Login to UMS");
        Assert.fail();
    }
    @Test(dependsOnMethods = "login")
    void accessHomepage(){
        System.out.println("Homepage Accessed");
    }
    @Test(dependsOnMethods = {"login","accessHomepage"},alwaysRun = true,enabled = false)
    void accessAnnouncement(){
        System.out.println("View Announcement");
    }
}
