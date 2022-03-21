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

public class AppTest2 {

	@Test(groups = { "smoke" })
	public void Test3() {
		System.out.println("Test 3");

	}

	@Test
	public void Test4() {

		System.out.println("Test 4");
	}
}
