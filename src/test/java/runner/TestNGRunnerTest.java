package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue = {"stepDefinitions", "customType", "hooks", "factory", "context", "domainObjects", "constants"},
        features = {"src/test/resources/features/add_cart.feature"},
        plugin = {"html:target/cucumber-reports/cucumber.html"
                , "json:target/cucumber-dry.json", "pretty:target/cucumber-pretty-dry.txt"}
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
