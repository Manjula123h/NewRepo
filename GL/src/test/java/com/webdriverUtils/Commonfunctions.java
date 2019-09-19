package com.webdriverUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonfunctions {
public static WebDriver driver;
	
public  void  driverSetup( ) {

	//System.setProperty("webdriver.chrome.driver","C:\\Users\\uc255948\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","./chromedriver 2");

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	public void scrollByJavascript(WebElement ele)

	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	

public void jsClick(WebElement ele) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", ele);
	}

	

	public void closeDriver() {
		driver.quit();
	}
	
	
}
