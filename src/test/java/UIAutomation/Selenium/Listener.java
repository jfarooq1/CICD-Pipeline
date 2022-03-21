package UIAutomation.Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println();

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finish");

	}

}
