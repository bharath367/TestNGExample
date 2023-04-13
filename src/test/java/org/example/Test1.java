package org.example;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void beforesuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    void afetrsuite(){
        System.out.println("after suite");
    }
    @BeforeTest
    void beforetest(){
        System.out.println("This will run before the test");
    }
    @AfterTest
    void aftertest(){
        System.out.println("This will run afeter the test");
    }
    @BeforeClass
    void beforeclass(){
        System.out.println("This will run before the class");
    }
   @AfterClass
    void afterclass(){
        System.out.println("This will run after the class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will run  before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will run after every method");
    }
   @Test
    void test1(){
        System.out.println("This is Test 1");
    }
    @Test
    void test2(){
        System.out.println("This is Test 2");
    }
    @Test
    void test3(){
        System.out.println("This is Test 3");
    }

}
