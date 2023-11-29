package TestNG;

import org.junit.Before;
import org.testng.annotations.*;

public class Before_Execution {
@BeforeTest
public void BeforeTest(){
    System.out.println("Before Test Execution");
}
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("Before Test Method");
    }
    @Test
    public void Test1()
    {
        System.out.println("Test1");
    }
    @Test
    public void Test2()
    {
        System.out.println("Test2");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After Test Execution");
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Test Method");
    }



}
