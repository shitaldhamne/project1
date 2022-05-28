package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperation
{
	public static ConfigReader config;
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
{
	try{
	String bname=(String) inputParameters[0];
	if(bname.equalsIgnoreCase("Chrome"))
		{
		config=new ConfigReader();
	System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	}
	else if(bname.equalsIgnoreCase("FF"))
	{
		System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	}
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: browserLaunch,Input Given: " + inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: browserLaunch,Input Given: " + inputParameters[0].toString());
	}
	return outputParameters;
	
}
public static Hashtable<String,Object> openApplication()
{
	try
	{
		
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		driver.get(config.getApplicationUrl());
		
		
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: openApplication,Input Given: " +config.getApplicationUrl().toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: openApplication,Input Given: " + config.getApplicationUrl().toString());
		
	}
	return outputParameters;
}
public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
{
	try
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	String XPATH=(String) inputParameters[0];
	driver.findElement(By.xpath(XPATH)).click();
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: clickOnElement,Input Given: " + inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: clickOnElement,Input Given: " + inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
{
	try
	{
		Thread.sleep(5000);
	String XPATH=(String) inputParameters[0]; 
	Actions act= new Actions(driver);
	WebElement a=driver.findElement(By.xpath(XPATH));
	act.moveToElement(a).build().perform();
	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: moveToElement,Input Given: " + inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: moveToElement,Input Given: " + inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> sendKeys(Object[]inputParameters) 
{
	try
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	String XPATH=(String) inputParameters[0];
	String value=(String) inputParameters[1];
	driver.findElement(By.xpath(XPATH)).sendKeys(value);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: sendKeys,Input Given: " + inputParameters[1].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: sendKeys,Input Given: " + inputParameters[1].toString());
	}
	return outputParameters;
}

public static Hashtable<String,Object> validation(Object[]inputParameters)
{
	try
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	String XPATH= (String) inputParameters[0];
	String text= (String) inputParameters[1];
	String actualtext=driver.findElement(By.xpath(XPATH)).getText();
	if(actualtext.equalsIgnoreCase(text))
	{
		System.out.println("Test Case Pass");
	}
	else
	{
		System.out.println("Test Case Fail");	
	}
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: validation,Input Given: " + inputParameters[1].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: validation,Input Given: " + inputParameters[1].toString());
	}
	return outputParameters;
}

public static Hashtable<String,Object> validationForInvalid(Object[]inputParameters)
{
	try
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
	String XPATH= (String) inputParameters[0];
	String text= (String) inputParameters[1];
	String actualtext=driver.findElement(By.xpath(XPATH)).getText();
	if(actualtext.equalsIgnoreCase(text))
	{
		System.out.println("Test Case Pass");
	}
	else
	{
		System.out.println("Test Case Fail");	
	}
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed: validationForInvalid,Input Given: " + inputParameters[1].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed: validationForInvalid,Input Given: " + inputParameters[1].toString());
	}
	return outputParameters;
}




}
