package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
  //  @Test(dataProvider="getDataa") //When Data Provider is in same class
    @Test(dataProvider="getDataa", dataProviderClass =CustomDataProvider.class ) //When Data Provider is in another class
    public void logindata(String Email, String Password)
    {
        System.out.println("Email: " +Email+ "  Password: " +Password);
    }

//    @DataProvider(name = "getDataa")
//    public Object[][] getData()
//    {
//
//        Object[][] data = {{"Test1@gmail.com", "Test@123"},{"Test2@gmail.com", "Test@123"}};
//        return data;
//    }

}
