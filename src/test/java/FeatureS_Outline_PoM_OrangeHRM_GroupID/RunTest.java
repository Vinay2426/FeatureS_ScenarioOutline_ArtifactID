package FeatureS_Outline_PoM_OrangeHRM_GroupID;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = ".",
                tags = "@invalidLogin",
                dryRun = false, //if it's true, it will check the code without running the automation pages and it will give output in console window
                monochrome = true, //it will remove unnecessary codes from console/result window
                format = {"pretty", "html:target/Destination"}
                )
public class RunTest
{
}
