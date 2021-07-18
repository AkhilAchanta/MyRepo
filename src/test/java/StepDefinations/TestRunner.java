package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinations"},monochrome=true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@login or @title or @home")
public class TestRunner {

}
