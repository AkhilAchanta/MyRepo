package StepDefinations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class getTitle extends Reusables {

	static String s1;
	@Given ("User is already on flipkart")
	public void User_is_already_on_flipkart()
	{
		s1=driver.getTitle();
	}
	@When ("user does nothing")
	public void does_nothing()
	{WebDriverWait wait =new WebDriverWait(driver,30);
	WebElement text= wait.until(ExpectedConditions.presenceOfElementLocated(Textbox));
	text.sendKeys(s1);

		System.out.println("Flikart");
		
	}

	@Then ("Get Title")
	public void Get_Title()
	{
		System.out.println(s1);
		Assert.assertEquals(s1,driver.getTitle());
		
	}

}
