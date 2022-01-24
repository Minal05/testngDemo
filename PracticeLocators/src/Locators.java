import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String parentHandle=driver.getWindowHandle();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div //span[@class='nav-cart-icon nav-sprite']")).click();
	//	driver.findElement(By.xpath("//div //input[@id='twotabsearchtextbox']")).sendKeys("Clothes");
	//	Thread.sleep(1000);
	
		
	//	Select drpdown=new Select (driver.findElement(By.xpath("//div //select[@id='searchDropdownBox']")));
	//	drpdown.selectByIndex(1);
		driver.switchTo().window(parentHandle);
		driver.navigate().back();
		driver.findElement(By.xpath("//div //a //i[@class='a-icon a-icon-next-rounded']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div //a //i[@class='a-icon a-icon-next-rounded']")).click();
		//driver.findElement(By.xpath("//div //div[@class='nav-search-submit nav-sprite']")).click();	
		
		driver.switchTo().window(parentHandle);
		Thread.sleep(1000);
		//driver.findElement(By.xpath(parentHandle)).click();
	}

}
