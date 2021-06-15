	package targetWebproject;

		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateAccount {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\driver\\chromedriver.exe");
				// Main House name : dirver 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.target.com/");
			driver.manage().window().maximize(); 
			
		
			driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	// 1.created a partition inside the driver house named "signin"
	WebElement signin = driver.findElement(By.cssSelector("#account > span.styles__AccountName-sc-1kk0q5l-0.iQFCAn"));
			signin.click();
			
	// 2.created a partition inside the driver house named "createaccount"
    WebElement createaccount = driver.findElement(By.cssSelector("#accountNav-createAccount > a"));
			createaccount.click();
			
	//3. created a partition inside the driver house named "emailAddress"
					
    WebElement emailAddress = driver.findElement(By.cssSelector("#username"));
		    emailAddress.sendKeys("amin_earth5@yahoo.com");	
		    
		    
	// 4.created a partition inside the driver house named "firstName"
    WebElement firstName= driver.findElement(By.cssSelector("#firstname"));
		    firstName.sendKeys("Jhon");	

   // //5. created a partition inside the driver house named "lastName"
    WebElement lastName= driver.findElement(By.cssSelector("#lastname"));
            lastName.sendKeys("Smith");
            
     // 6.created a partition inside the driver house named "phoneNumber"  
            
    WebElement phoneNumber= driver.findElement(By.cssSelector("#phone"));
            phoneNumber.sendKeys("7036236343");
            
    //7. created a partition inside the driver house named "createPassword"       
   WebElement createPassword= driver.findElement(By.cssSelector("#password"));
            createPassword.sendKeys("Samia1991@");
            
    //8. created a partition inside the driver house named "password"       
   WebElement showPassword = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div[6]/div[2]/button"));
			showPassword.submit();
		
	//9. created a partition inside the driver house named "accountSubmit"		
   WebElement accountSubmit= driver.findElement(By.cssSelector("#createAccount"));
				accountSubmit.click();
					
	}
}
