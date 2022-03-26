package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sre Yamini");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("I");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yams");
	
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		
		driver.findElement(By.name("description")).sendKeys("LearnSelenium");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sreyamini22@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select Province = new Select(dropDown);
		
		Province.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");

		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The title of new page is "+title);
	}

}
