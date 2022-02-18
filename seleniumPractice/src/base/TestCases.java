package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Driver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gh-search-input']"+ Keys.ENTER));
		driver.findElement(By.xpath(""))
	}
		

	

}
