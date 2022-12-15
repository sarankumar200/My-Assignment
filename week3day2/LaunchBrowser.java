package week3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("testleaf");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDropDown=new Select(source);
		sourceDropDown.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr/Mrs");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LaunchBrowser");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("150000");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDropDown=new Select(industry);
		industryDropDown.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDropDown=new Select(ownership);
		ownershipDropDown.selectByVisibleText("Sole Proprietorship");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2410");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("the world is very bigeer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("world");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("9876");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sai@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("software");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("35 anna nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("5555");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("55555");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leaf");
		
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDropDown=new Select(marketing);
		marketingDropDown.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("leaf");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("1.12.2001");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software");
		
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDropDown=new Select(currency);
		currencyDropDown.selectByValue("DZD");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("9999");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("*");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7871987881");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("english");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("chrome");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("chennai");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropDown=new Select(state);
		stateDropDown.selectByValue("IN");
		
		WebElement cuntry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cuntryDropDown=new Select(cuntry);
		cuntryDropDown.selectByValue("DZA");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	}
}