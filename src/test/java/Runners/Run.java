package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Register_Test.feature", "src/test/resources/Login_Test.feature", "src/test/resources/flight_oneway.feature", "src/test/resources/RegisterNotSuccessful_Test.feature"},
        glue = {"StepDefinitios"},
        plugin = {"pretty", "html:target/ML/report.html"} // Opciones de reportes, puedes ajustar según tus necesidades
)
//primero extendemos la clase
public class Run extends AbstractTestNGCucumberTests {
}
