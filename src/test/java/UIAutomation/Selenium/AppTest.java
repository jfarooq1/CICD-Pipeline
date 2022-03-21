package UIAutomation.Selenium;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	@Test(groups = { "smoke" })
	public void Test1() throws MalformedURLException, IOException {
		System.out.print("Test1");
	}

	@Test(dataProvider = "getObj")
	public void Test2(String A, String B) {

		System.out.print(A);
		System.out.print(B);

	}

	@DataProvider
	public Object[][] getObj() {

		Object[][] obj = new Object[2][2];
		obj[0][0] = "Jahanzab";
		obj[0][1] = "Farooq";
		obj[1][0] = "Salman";
		obj[1][1] = "Farooq";

		return obj;

	}
}
