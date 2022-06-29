package Shipments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShipPage extends ShipUtils {
	@Test(dataProvider = "Shipment" )
	public void Login(String url,String email,String pass) throws Exception {
		///try {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//test = extent.createTest("loginpickupuser");
		driver.get(url);
		//test.pass("Navigated to channelsmart");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.getTitle();
		//test.pass("email is passed");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		//test.pass("Given password ");
		driver.findElement(By.xpath("//div[contains(@class,'form-group text-left')]/following-sibling::button[1]")).click();
		String title= driver.getTitle();
		System.out.println("title is"+title);
		
		//click the shipment page
		WebElement clkshipment=driver.findElement(By.xpath("//a[@href='/shipmentsDetails']"));
		clkshipment.click();
		
		//download the label
		WebElement label=driver.findElement(By.xpath("//mat-icon[text()='download']"));
		label.click();
		
		//track the shipments
		WebElement element = driver.findElement(By.xpath("//mat-icon[text()='track_changes']"));
		element.click();
		
		//cancel the shipment
		WebElement cancel=driver.findElement(By.xpath("//mat-icon[text()='cancel']"));
		cancel.click();
		
		
		
		
}
	}
