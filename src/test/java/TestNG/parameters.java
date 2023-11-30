package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
    @Test
    @Parameters({"param1", "param2"})
    public void test(String param1, String param2)
    {
        System.out.println("Param 1"+param1+" Param 2"+param2);
    }
}
