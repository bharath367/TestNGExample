package org.example;

import org.testng.annotations.DataProvider;

public class DataClass1 {
    @DataProvider(name="mylogindata")
    public Object[][] getloginData(){
        Object[][] data = {{11906717,"Bharath","bharathsimhareddykerala@gmail.com"},{11906716,"Rajesh","rajesh123@gmail.com"}};
        return data;
    }
}
