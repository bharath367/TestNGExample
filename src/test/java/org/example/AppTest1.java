package org.example;

import org.testng.annotations.Test;

public class AppTest1 {
    @Test(priority = 1)
    void test1(){
        System.out.println("Test1");
    }
    @Test(priority = 2)
    void test2(){
        System.out.println("Test2");
    }
    @Test(priority = 3)
    void test3(){
        System.out.println("Test3");
    }


}
