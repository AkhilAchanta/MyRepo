package StepDefinations;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.MoveAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends Reusables {

	@Given("User is already on Home Page")
	public static void user_is_already_on_home_page() {
		driver.findElement(ElectronicsHome).click();

	}

	@When("user needs he options available")
	public 	static void user_needs_he_options_available() {
		try {
			Thread.sleep(5111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MouseOver(driver, ElectronicsHome);
		
		MouseOver(driver, EleOptions);
	}

	@Then("user should see the list and count of the options avialable")
	public static void user_should_see_the_list_and_count_of_the_options_avialable() {

		/*
		 System.out.println("Electronics selected");
		WebDriverWait wait= new WebDriverWait(driver,30);
		List <WebElement> Eleoptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(EleOptions)); 
		*/
		List <WebElement> Eleoptions = driver.findElements(EleOptions);
		int numOptions = Eleoptions.size();
		System.out.println(numOptions);
		//Assert.assertEquals(24,numOptions);
		Iterator<WebElement> it = Eleoptions.iterator();
		while(it.hasNext())
		{
			String Element = it.next().getText();

			//String OptName= driver.findElement((By) Element).getText();
			System.out.println(Element);

		}

	}


}
