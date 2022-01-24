import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Sel_Minal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\minal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
	   // driver.findElement(By.xpath("//a[text()='Bangladesh']")).click();
	/*	List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options)
		{
		  if(option.getText().equalsIgnoreCase("India"))
		  {
			  option.click();
		  }
		}*/
		
		//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//or
			driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		}

}
