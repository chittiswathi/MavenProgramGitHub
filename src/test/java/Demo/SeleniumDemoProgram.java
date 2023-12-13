package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemoProgram {

	@Parameters("Browsername")
	@Test
	public void loginTest(String browser)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		System.out.println(browser);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
