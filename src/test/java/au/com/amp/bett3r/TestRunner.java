package au.com.amp.bett3r;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	strict = true,
	plugin = {"html:target/cucumber-html-report",
            "html:target/cucumber",
		"pretty",
		})
public abstract class TestRunner {}
