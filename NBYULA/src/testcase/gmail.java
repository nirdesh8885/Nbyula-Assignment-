package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://nbl.one");
			@SuppressWarnings("unused")
			boolean LinkStatus =driver.findElement(By.linkText("Skylifts")).isDisplayed();
			if (LinkStatus=true){
				System.out.println("Skylifts Link is Exists in Nbyula Homepage – Passed");
				}
				else
				{
				System.out.println("Skylifts Link is Not Exits in Nbyula Homepage -Failed");
				}
				driver.close();
				}
				}
