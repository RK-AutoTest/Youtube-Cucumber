package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/Reports/cucumber-reports.html"},
        //path of feature file
        features = "C:\\Users\\User\\IntelliJIDEAProjects\\YouTube_Cucumber\\src\\test\\java\\Features\\Feature1.feature",
        monochrome = true,
        //path of step definition file
        glue = {"Definition"}
)
public class CucumberRunner {
}
