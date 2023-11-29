package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2
{
    @Test
    public void test( )
    {
        System.out.println("Running Annotations 2");
    }
    @BeforeSuite
    public void beforesuite( )
    {
        System.out.println("Running Before Suite");
    }
       @AfterSuite
    public void aftersuite( )
    {
        System.out.println("Running after Suite");
    }


}
