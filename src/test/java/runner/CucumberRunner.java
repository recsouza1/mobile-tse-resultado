package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import util.DriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Run the scenarios specified by tags
        //tags = {""},

        // Define the features files location
        features = {"src/test/resources/features"},

        // Define the steps files location
        glue = {"steps"},

        // Readable format of the console output from Cucumber
        monochrome = true,

        // Code snippets will be created using camelcase
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        // Plugins
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
class CucumberRunner {

    @BeforeClass
    public static void setUp(){
        DriverManager.getDriver();
    }

    @AfterClass
    public static void tearDown(){
        DriverManager.closeDriver();
    }
}