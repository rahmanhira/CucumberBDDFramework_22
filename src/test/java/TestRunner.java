import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = "src/test/java/features",
            plugin = {
                   "json:target/cucumber.json",
                    "html:target/cucumber-html-report"
            },
            glue = "stepDef",
        tags = "@logIn"
)
    public class TestRunner extends AbstractTestNGCucumberTests {
}