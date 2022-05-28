package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
public static void main(String[]arg) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\automation software\\selenium software\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//open application
	driver.get("https://www.flipkart.com/");
	//cancel login page
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	//move cursor on login
	Actions act= new Actions(driver);
	act.moveToElement(driver.findElementByXPath("//*[@class='_1_3w1N']")).build().perform();
	//click on my profile
	driver.findElementByXPath("//*[text()='My Profile']").click();
	//enter username
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8308528195");
	//enter pw
driver.findElementByXPath("//*[@type='password']").sendKeys("Shital@123");
//login
driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
Thread.sleep(5000);
driver.findElementByXPath("//*[text()='Manage Addresses']").click();
driver.findElementByXPath("//*[text()='ADD ADDRESSES']").click();
driver.findElementByXPath("//*[@tabindex='1']").sendKeys("Snehal");
driver.findElementByXPath("//*[@tabindex='2']").sendKeys("8308528195");
driver.findElementByXPath("//*[@tabindex='3']").sendKeys("414005");
driver.findElementByXPath("//*[@tabindex='4']").sendKeys("Kedgaon");
driver.findElementByXPath("//*[@tabindex='5']").sendKeys("R.C.C GROUND");
driver.findElementByXPath("//*[text()='Home']").click();
driver.findElementByXPath("//*[@tabindex='10']").click();

}

}
