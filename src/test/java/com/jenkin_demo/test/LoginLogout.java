package com.jenkin_demo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginLogout {

	//dante
	// vergil
	@Test
	public void loginLogoutActiTime() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chrome driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/gecko driver/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./src/main/resources/driver/edge driver/msedgedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.TAB+Keys.TAB+Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(1000);
		System.out.println("PASS: successfully login and Logout to application");
		driver.quit();
	}
}
