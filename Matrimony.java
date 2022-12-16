package week3day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		
		WebElement profile=driver.findElement(By.id("REGISTERED_BY"));
		Select profileDropDown=new Select(profile);
		profileDropDown.selectByVisibleText("Myself");
		
		driver.findElement(By.id("NAME")).sendKeys("saran");
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
		
		WebElement day=driver.findElement(By.id("DOBDAY"));
		Select dayDropDown=new Select(day);
		dayDropDown.selectByVisibleText("10");
		
		WebElement month=driver.findElement(By.id("DOBMONTH"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("Dec");
		
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByVisibleText("2001");
		
		WebElement relig =driver.findElement(By.className("selectfield"));
		Select religDropDown=new Select(relig);
		religDropDown.selectByVisibleText("Hindu");
		
		WebElement mother=driver.findElement(By.id("MOTHERTONGUE"));
		Select motherDropDown=new Select(mother);
		motherDropDown.selectByVisibleText("Hindi");
		
		WebElement country=driver.findElement(By.id("COUNTRY"));
		Select countryDropDown=new Select(country);
		countryDropDown.selectByVisibleText("India");
		
		WebElement num=driver.findElement(By.id("M_COUNTRYCODE"));
		Select numDropDown=new Select(num);
		numDropDown.selectByVisibleText("+91");
		
		driver.findElement(By.id("MOBILENO")).sendKeys("457896433");
		driver.findElement(By.id("EMAIL")).sendKeys("sai@gmail.com");
		driver.close();
		
		
	}

}
