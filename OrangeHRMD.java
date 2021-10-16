package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMD {
	public static WebDriver driver;
public static void main(String[] args) throws IOException {
	    System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\TestingTypes\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Utility.takeScreenshot(driver, "username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Utility.takeScreenshot(driver, "password");

}}