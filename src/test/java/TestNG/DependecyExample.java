package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependecyExample {
    @Test
    public  void startCar()
    {
        System.out.println("To start the car");
        Assert.fail();

    }
    @Test(dependsOnMethods = {"startCar"})
    public  void driveCar()
    {
        System.out.println("To drive the car");

    }
    @Test(dependsOnMethods = {"driveCar"})
    public  void stopCar()
    {
        System.out.println("To stop the car");

    }
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    public  void parkCar()
    {
        System.out.println("To park the car");

    }

}
