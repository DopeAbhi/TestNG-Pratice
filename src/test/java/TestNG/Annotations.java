package TestNG;

import org.testng.annotations.*;

public class Annotations {
@BeforeTest
public void BeforeTest(){
    System.out.println("Before Test Execution");
}
@BeforeClass
public void BeforeClass(){
    System.out.println("Before Class Execution");
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
    @Test(enabled = false)
    public void Test3() {System.out.println("Test3");} //Disable the test
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Test Method");
    }

    @AfterClass()
public void AfterClass()
    {
        System.out.println("After Class Execution");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After Test Execution");
    }




}
