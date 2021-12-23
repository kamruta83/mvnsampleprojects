package CRMStepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginstepDef {
	WebDriver driver;

	@Given("User is already on login page ")
	public void user_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/login");

		
	}

	@When ("User enters{string} and {string} ")
	public void  user_enters_and(String strUser,String strPwd) {
		driver.findElement(By.name("Username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector(".radius")).click();
		
		
	}

	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		boolean isValidUser =driver.findElement(By.cssSelector("div.success")).isDisplayed();
		Assert.assertTrue(isValidUser);
	}

}
