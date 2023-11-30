package TestNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "getDataa")
    public Object[][] getData()
    {

        Object[][] data = {{"Test1@gmail.com", "Test@123"},{"Test2@gmail.com", "Test@123"}};
        return data;
    }
}
