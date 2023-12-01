package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListners.class)
public class ListenersExample {

    @Test
    public void Test1()
    {
        System.out.println("Test 1");
        Assert.assertEquals(1,1);
    }
    @Test
    public void Test2()
    {
        System.out.println("Test 2");
        Assert.assertEquals("A","B");
    }
    @Test
    public void Test3()
    {
        System.out.println("Test 2");
       throw new SkipException("Skip exception");
           }

}
