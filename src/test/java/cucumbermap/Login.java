package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Login 
{
	@When ("^user open \"(.*)\" browser with exe$") 
	   public void bLaunch(String bname)
	   {
		Object[] input=new Object[1];
		input[0]=bname;
	    SeleniumOperation.browserLaunch(input);	
	   }
	@When ("^user open url as$")
	public void openApp()
	{
		SeleniumOperation.openApplication();
	
	}
	
	@When ("^user cancle initial Login window$")
	  public void cancleLoginW()
	  {
		Object[]input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickOnElement(input2);
	  }
	@When ("^user navigate on Login button$")
	public void navigateLogin()
	{
		Object[]input3= new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output3=SeleniumOperation.moveToElement(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on Login button$",output3.get("MESSAGE").toString());
	}
	@When ("^user click on MyProfile$")
	public void MyP()
	{
		Object[]input4= new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output4=SeleniumOperation.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on MyProfile$",output4.get("MESSAGE").toString());
	}
	@When ("^user enter \"(.*)\" as username$")
	public void uname(String uName) throws InterruptedException
	{
		Thread.sleep(5000);
		Object[]input5= new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]=uName;
		Hashtable<String,Object> output5=SeleniumOperation.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$",output5.get("MESSAGE").toString());
	}
	@When ("^user enter \"(.*)\" as password$")
	public void pass(String passwd) throws InterruptedException
	{
		Thread.sleep(5000);
		Object[]input6= new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=passwd;
		Hashtable<String,Object> output6=SeleniumOperation.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$",output6.get("MESSAGE").toString());
	}
	@When ("^user click on Login button$")
	public void loginB()
	{
		Object[]input7= new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output7=SeleniumOperation.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$",output7.get("MESSAGE").toString());
	}
	@Then ("^Application shows user profile to user$")
		public void valid() throws InterruptedException
		{
		Thread.sleep(5000);
		Object[]input8= new Object[2];
		input8[0]="//*[@class='_1ruvv2']";
		input8[1]="Snehal Pawar";
		Hashtable<String,Object> output8=SeleniumOperation.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$",output8.get("MESSAGE").toString());
		}
	
	@Then ("^Application shows appropriate error message$")
	public void invalid()
	{
		Object[]input9= new Object[2];
		input9[0]="(//*[text()='Login'])[2]";
		input9[1]="Login";
		Hashtable<String,Object> output9=SeleniumOperation.validationForInvalid(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^Application shows appropriate error message$",output9.get("MESSAGE").toString());
	}
	@When ("^user enters (.+) as username$")
	public void uName(String given)
	
	{
		Object[]input10= new Object[2];
		input10[0]="(//*[@type='text'])[2]";
		input10[1]=given;
		SeleniumOperation.sendKeys(input10);	
	}
	@When ("^user enters (.+) as password$")
	public void password(String given)
	{
		Object[]input11= new Object[2];
		input11[0]="//*[@type='password']";
		input11[1]=given;
		SeleniumOperation.sendKeys(input11);	
	}
	
	
}
