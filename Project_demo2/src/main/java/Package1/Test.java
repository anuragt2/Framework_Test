package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public void test() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		
		String text = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).getText();
		System.out.println("Displayed Text :"+text);
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		Thread.sleep(5000L);
		
	}


}
