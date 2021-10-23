package TH_23_10;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerTest implements ITestListener {
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case Started: " + result.getName());
    }
	@Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successfully: " + result.getName());
    }
	@Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }
	@Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
	@Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but within success percentage: " + result.getName());
    }
	@Override
    public void onStart(ITestContext context) {
        System.out.println("This is onStart method! ");
    }
	@Override
    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish method! ");
        
    }
}