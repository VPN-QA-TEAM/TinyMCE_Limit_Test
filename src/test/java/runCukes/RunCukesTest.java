package runCukes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "hooks",
                "StepDef"
        },
        features = {"classpath:features/"},
        plugin = {"pretty",
                "html:target/site/Report.html",
                "json:target/cucumber/cucumber.json"
        }
)

public class RunCukesTest {
}
