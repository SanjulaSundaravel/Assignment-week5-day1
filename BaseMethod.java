package learnTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	public ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
