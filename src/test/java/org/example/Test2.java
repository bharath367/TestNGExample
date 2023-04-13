package org.example;

import org.testng.annotations.*;

public class Test2 {
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
        System.out.println("This will run after before method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will run after after method");
    }
    @Test
    void test4(){
        System.out.println("This is Test 4");
    }
    @Test
    void test5(){
        System.out.println("This is Test 5");
    }
    @Test
    void test6(){
        System.out.println("This is Test 6");
    }

}
