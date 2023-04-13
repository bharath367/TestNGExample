package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
//    @DataProvider(name="mylogindata")
//    public Object[][] getloginData(){
//        Object[][] data = {{11906717,"Bharath","bharathsimhareddykerala@gmail.com"},{11906716,"Rajesh","rajesh123@gmail.com"}};
//        return data;
//    }
    @Test(dataProvider = "mylogindata",dataProviderClass = DataClass1.class)
    public void loginForm(int reg, String name, String email){
        System.out.println(reg + "->" + name + "->" + email);
    }
}
