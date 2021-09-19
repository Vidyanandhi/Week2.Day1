package Assingnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadCase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("title:" +title);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Medusind");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidyaraj");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("VR");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/22/1996");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3000000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("VDRI");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AKR");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium in Testleaf");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9874563210");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123054");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sethu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidya.an.1422@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("perumbakkam");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("kundrathur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600100");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
		driver.findElement(By.className("smallSubmit")).click();



	}

}
