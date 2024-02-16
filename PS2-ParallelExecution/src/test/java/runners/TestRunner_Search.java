package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Search.feature",
glue= {"stepdefinitions"},
tags = "@tag",
plugin= {"pretty", "html:target/cucumber-reports2"}
)
public class TestRunner_Search {

	

}
