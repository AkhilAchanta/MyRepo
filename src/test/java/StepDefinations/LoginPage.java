package StepDefinations;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Reusables {

	// TODO Auto-generated method stub
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		try {System.out.println("User is on Login Page");
		chromeDriver();

		driver.get("https://www.flipkart.com");
		ScreenShot(driver, "home");
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("MyFirstTest", "Testing Extent Reorts");
ScreenShot(driver, "img");
ScreenShotByte(driver, "Test");
		// reference image saved to disk
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath("JavaCucu/target/screenShot/home.png").build());

		// base64
		test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String("JavaCucu/target/screenShotByte/Test.png").build());

		//Reusables.getProperties("login.button.xpath");
extent.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		System.out.println("Username:"+string);
		System.out.println("Username:"+string2);
		try {
			driver.findElement(username).sendKeys(string);
			driver.findElement(password).sendKeys(string2);Thread.sleep(5000);
			driver.findElement(login).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println("Login Button clicked");
		driver.manage().window().maximize();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		System.out.println("User lands on home page");
		ScreenShot(driver, "Home");
	}



}
