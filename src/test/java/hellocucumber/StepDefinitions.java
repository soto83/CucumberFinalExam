package hellocucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	
	WebDriver driver;

	public StepDefinitions() {
		//System.writeln("Hello")
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
       	driver.get("https://techfios.com/test/102/");
       
	}
	// Question 1 please uncomment to run	
	//@Given("Set SkyBlue Background")
    public void anExampleScenario() {    
		System.out.println("Setting Sky Background");
    }

   //@When("I click on the button")
    	public void allStepDefinitionsAreImplemented() {
		WebElement e = driver.findElement(By.cssSelector("button[onclick^=myFunctionSky]"));
		//toggle_all_checkbox.click();
		e.click();
		System.out.println("Set Sky blue pressed");
    }

    //@Then("the background color will change to sky blue")
    	public void theScenarioPasses() {
		System.out.println("Sky blue background set");
    }

	@Given("Set White Background")
    public void anExample() {    
		System.out.println("Setting Sky Background");
    }

    @When("I click on the button")
    public void allStepDefinitionsAreImplement() {
		// setting element to skyblue before to white to make sure it is working
		WebElement e = driver.findElement(By.cssSelector("button[onclick^=myFunctionSky]"));
		e.click();
		WebElement f = driver.findElement(By.cssSelector("button[onclick^=myFunctionWhite]"));
		f.click();
		System.out.println("Set white button pressed");
    }

    @Then("the background color will change to white")
    public void theScenarioPass() {
		System.out.println("Sky blue background set");
    }

}
