package testNGSessionsLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceUSCellularTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void loginPageTest() {
		driver = new ChromeDriver();
		
		driver.get("https://www.uscellular.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
	}
	
	@Test
	public void phoneGalleryTest() {
		driver.findElement(By.xpath("//a[@aria-label='menu-item-Phones']")).click();
		driver.findElement(By.xpath("//a[@class='usc-navigation__products-links'][normalize-space()='iPhone']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"dialog\"]/div[1]/div/div[1]/div[1]/button")).click();
		
		
	}
	
}
