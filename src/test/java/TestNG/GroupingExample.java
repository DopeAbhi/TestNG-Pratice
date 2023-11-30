package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups ={"sanity"})
    public void test1() {
        System.out.println("This is Test1");
    }
    @Test(groups ={"sanity"})
    public void test2()
    {
    System.out.println("This is Test2");
    }
    @Test(groups ={"regression"})
    public void test3()
    {
    System.out.println("This is Test3");
    }
    @Test(groups ={"sanity","regression"})
    public void test4()
    {
    System.out.println("This is Test4");
    }
}
