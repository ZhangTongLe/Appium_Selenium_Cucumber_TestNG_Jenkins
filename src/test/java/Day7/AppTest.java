    package Day7;

    import cucumber.api.CucumberOptions;
    import cucumber.api.testng.AbstractTestNGCucumberTests;


    @CucumberOptions(
            features = {"classpath:features/search.feature"},
            glue = "Day7.steps",
            plugin = {"pretty", "html:target/cucumber-html-report;","json:report/cucumber.json" }
    )


    public class AppTest extends AbstractTestNGCucumberTests {





    }
