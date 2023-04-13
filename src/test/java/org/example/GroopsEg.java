package org.example;

import org.testng.annotations.Test;

public class GroopsEg {
    @Test(groups = "regression")
    void Method1(){
        System.out.println("Method 1");
    }
    @Test(groups = "Critical")
    void Method2(){
        System.out.println("Method 2");
    }
    @Test(groups = "Critical")
    void Method3(){
        System.out.println("Method 3");
    }
    @Test(groups = "regression")
    void Method4(){
        System.out.println("Method 4");
    }
@Test(groups = {"Critical","regressio"})
    void Method5(){
        System.out.println("Method 5");
    }
    @Test(groups = "Critical")
    void Method6(){
        System.out.println("Method 6");
    }
}
