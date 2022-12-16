package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sk");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7871764356");
		driver.findElement(By.id("password_step_input")).sendKeys("saran123");
		
		WebElement birth=driver.findElement(By.id("day"));
		Select birthDropDown=new Select(birth);
		birthDropDown.selectByVisibleText("10");
		
		WebElement month=driver.findElement(By.id("month"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByValue("10");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByVisibleText("2002");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).sendKeys("Male");
		
	}

}
