package flights;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class TestCase {
	
	WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeClass
	public void bc() {
		driver=BrowserFactory.openBrowser();	 
	}

	@Test
	public void flight_booking() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://newuat.travelwings.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.id("origin_0")).sendKeys("del");
//		Actions act = new Actions(driver);
//		
//		WebElement origin_add=driver.findElement(By.xpath("//div[@class='ctyname' and text()='New Delhi (DEL)']"));
//		act.moveToElement(origin_add).build().perform();
//		origin_add.click();
//		
//		driver.findElement(By.id("destination_0")).sendKeys("dxb");
//		WebElement dest_add=driver.findElement(By.xpath("//div[@class='ctyname' and text()='Dubai (DXB)']"));
//		act.moveToElement(dest_add).build().perform();
//		dest_add.click();
//		
//		driver.findElement(By.id("journeyDate_0")).click();
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		
//		String departing_month="January";
//		String departing_day="30";
//
//		String month=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).get(0).getText();
//		
//		if(month.equalsIgnoreCase(departing_month)) {
//			System.out.println("month selected");	
//		}else {
//			for(int i=1;i<12;i++) {
//				WebElement next_month=driver.findElement(By.xpath("//body[@class='ng-scope']/div[3]/div[2]/div/a[@title='Next']"));				
//				wait.until(ExpectedConditions.elementToBeClickable(next_month));
//				next_month.click();				month=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).get(0).getText();
//		if(month.equalsIgnoreCase(departing_month)){
//					break;
//}}}		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td")));
//		List<WebElement> enable_days = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
//		for(int j=0;j<enable_days.size();j++)
//			{
//			if(enable_days.get(j).getText().equalsIgnoreCase(departing_day))
//				{
//				enable_days.get(j).click();
//				}
//			}
//		
//		 
//		WebElement traveller = driver.findElement(By.xpath("//span[@class='traveler-text']"));
//		traveller.click();
//		
//		int a = 1;
//		int c=0;
//		int i=0;
//		
//		for(int n=1;n<a;n++){
//			WebElement adult_count=driver.findElement(By.xpath("//button[@data-ng-click='flight.addAdult()']"));
//			adult_count.click();
//		}
//
//		for(int o=1;o<=c;o++){
//			WebElement child_count=driver.findElement(By.xpath("//button[@data-ng-click='flight.addChild()']"));
//			child_count.click();
//		}
//		
//		for(int p=1;p<a;p++){
//			WebElement infant_count=driver.findElement(By.xpath("//button[@data-ng-click='flight.addInfant()']"));
//			infant_count.click();
//		}
//			
//		WebElement cancel_traveller=driver.findElement(By.xpath("//div[@class='cancel']/div"));
//		cancel_traveller.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement lets_play=driver.findElement(By.xpath("//button[@class='bttn-primary']"));
//
//		Wait.ewait(driver, lets_play);
//		
//		lets_play.click();
//		
//		
//		Thread.sleep(5000);
//		
//
//		List<WebElement> flights=driver.findElements(By.xpath("//p[@class='travel-company-name ng-binding']"));
//		
//		List<WebElement> select_buttons=driver.findElements(By.xpath("//button[@class='bttn-search']"));
//		
//		for(int j=0;j<flights.size();j++) {
//
//			if(flights.get(j).getText().equalsIgnoreCase("IndiGo Airlines")) {
//				select_buttons.get(j).click();
//				break;
//			}
//		}
//
//	Thread.sleep(5000);
//	
//	driver.findElement(By.xpath("//button[text()='CONTINUE' and @class='bttn-yellow yellow-button']")).click();
//	
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//div[@class='user-name']/input")).sendKeys("sonu@gmail.com");
//	
//	driver.findElement(By.xpath("//div[@class='continue']/input")).click();
//	
//	Thread.sleep(2000);
//	
//	WebElement title = driver.findElement(By.id("titleDd0"));
//	Select sl = new Select(title);
//	sl.selectByVisibleText("Mr.");
//	
//	WebElement first_name=driver.findElement(By.xpath("//div[text()='First Name']/../div[2]/input"));
//	first_name.sendKeys("sonu");
//	
//	WebElement last_name=driver.findElement(By.xpath("//div[text()='Last Name']/../div[2]/input"));
//	last_name.sendKeys("kumar");
//	
//	WebElement dob = driver.findElement(By.xpath("//input[@data-ng-model='booking.dob[$index]']"));
//	dob.click();
//	
//	Select sly=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-year']")));
//	sly.selectByVisibleText("1992");
//	
//	Select slm=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']")));
//	slm.selectByVisibleText("Jul");
//	
//	driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='3']")).click();
//	
//	driver.findElement(By.xpath("//div[@class='col-sm-8 type ng-scope']/input[2]")).sendKeys("9632587410");
//	
//	driver.findElement(By.xpath("//div[text()='Passport Number']/../div/input")).sendKeys("J85632");
//	
//	driver.findElement(By.xpath("//input[@data-ng-model='booking.passportExpireDate[$index]']")).click();
//	
//	Select sly1=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-year']")));
//	sly1.selectByVisibleText("2020");
//	
//	Select slm1=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']")));
//	slm1.selectByVisibleText("Jul");
//	
//	driver.findElement(By.xpath("//a[text()='3']")).click();
//	
//	driver.findElement(By.xpath("//button[text()='CONTINUE' and @class='bttn-yellow']")).click();
//
//	driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("4000000000000051");
//	
//	driver.findElement(By.xpath("//input[@id='cardHolderName']")).sendKeys("John Doe");
//	
//	driver.findElement(By.xpath("//input[@id='cvvNumber']")).sendKeys("111");
//	
//	Select exp_month = new Select(driver.findElement(By.xpath("//select[@data-ng-model='booking.carExpMonth']")));
//	exp_month.selectByVisibleText("12");
//	
//	Select exp_year= new Select(driver.findElement(By.xpath("//select[@name='expYear']")));
//	exp_year.selectByVisibleText("2020");
//	
//	driver.findElement(By.xpath("//div[@class='box']/input[@name='checkbox']")).click();
//	
//	driver.findElement(By.xpath("//div[@class='col-md-3 padding-zero']/button[@class='bttn-yellow']")).click();
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
		Helper.captureScreenshot(driver);
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
	
		Helper.captureScreenshot(driver);}
}


}
