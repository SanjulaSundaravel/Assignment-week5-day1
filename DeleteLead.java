package learnTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class DeleteLead extends BaseMethod {
	@Test(dependsOnMethods = "learnTestNG.DublicateLead.runTC002" )
	public void runTC003() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("(//label[text() = 'Phone Number:'])[4]/following::input[3]")).sendKeys("99");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("(//td[@class= 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		String deletedLeadId = text.getText();
		System.out.println(deletedLeadId);
		text.click();
		driver.findElement(By.xpath("((//div[@class='frameSectionExtra'])[2]/a)[4]")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]/a")).click();
		driver.findElement(By.xpath("((//label[@class='x-form-item-label'])[18]/following::input)[1]")).sendKeys(deletedLeadId);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(3000);
		String leadDeleted = driver.findElement(By.xpath("(//table)[21]/following::div[1]")).getText();
		System.out.println("Result is "+leadDeleted);
		
	}

}
