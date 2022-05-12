package executor;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import stepsDefinitions.CommonMethods;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsDefinitions"},
        plugin = { "pretty", "html:target/cucumber/report"},
        publish = true,
        monochrome = true,
        tags = "@regression and not @smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
    CommonMethods common = new CommonMethods();
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeSuite
    public void executeBeforeEachSuite() throws InterruptedException {
    }

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("Debug BeforeClass in Test Runner");

    }

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void finishTestRun() {

    }
}