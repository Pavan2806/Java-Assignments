package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavan");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("68");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6548");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9366587665");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Pavan@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 43,53nd street,banu nagar,pudur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600053");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();
		if (title.contains("opentaps")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
	}

}
}
