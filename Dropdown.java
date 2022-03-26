package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select byIndex = new Select(dropdown1);
		
		byIndex.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		
		Select byText = new Select(dropdown2);
		
		byText.selectByVisibleText("Appium");
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		
		Select byValue = new Select(dropdown3);
		
		byValue.selectByValue("3");
		
		
		
		
		}
		
		
	}


