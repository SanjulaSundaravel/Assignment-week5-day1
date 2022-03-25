package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DublicateLead extends BaseMethod {
	@Test(enabled = true)
	public void runTC002() {
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sanjula");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaravel");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SalesForce");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learn Automation testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sanjulasundaravel1117@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select location = new Select(state);
		location.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CG");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manvi");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Malotra");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println("Title of the page is "+title1);
		
		
		

	}

}
