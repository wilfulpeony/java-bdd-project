package stepsDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginStepsDefinitions {
    
    public LoginStepsDefinitions() {
    }


    @Before
    public void beforeActions(){
      //add here what to do before each scenario
    }
    @After
    public void afterActions(Scenario scenario){
        //add here what to do after each scenario

    }
    @Given("user opens an app")
    public void userOpensAnApp(){
        int a = 0;
    }

    @When("Languages page is opened")
    public void languagesPageIsOpened() {
        int a = 1;
    }

    @Then("list of languages is displayed")
    public void listOfLanguagesIsDisplayed() {

        Assert.assertTrue(false, "Testing test by test with test :3");
    }

    @And("select {string} language")
    public void selectEnglishLanguage() {

    }

}
