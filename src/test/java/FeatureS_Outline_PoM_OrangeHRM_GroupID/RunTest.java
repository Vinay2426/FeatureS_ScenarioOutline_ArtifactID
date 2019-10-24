package FeatureS_Outline_PoM_OrangeHRM_GroupID;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@login",format = {"pretty", "html:target/Destination"})
public class RunTest
{
}
