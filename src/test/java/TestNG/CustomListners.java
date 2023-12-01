package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener {


    public void onStart(ITestContext context) {
        System.out.println("Start Test Execution   "+context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Finish Test Execution   "+context.getName());
    }

    public void onTestStart(ITestResult context) {
        System.out.println("On Start Test Execution   "+context.getName());
    }
    public void onTestSkipped(ITestResult context) {
        System.out.println("On Skipped Test   "+context.getName());
    }
    public void onTestSuccess(ITestResult context) {
        System.out.println("On Success Test Execution   "+context.getName());
    }
    public void onTestFailure(ITestResult context) {
        System.out.println("On Skipped Test   "+context.getName());
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}


