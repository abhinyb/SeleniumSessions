package testNGSessionsLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPageTest {

	WebDriver driver;

	@BeforeMethod
	public void loginBestBuyTest() {
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}
	
	@Test
	public void searchExistsTest() {
		WebElement searchBar = driver.findElement(By.id("gh-search-input"));
		searchBar.sendKeys("Apple Mouse");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
	}
	
	@AfterMethod
	public void AfterMethodLogin() {
		driver.close();
		
	}

}
