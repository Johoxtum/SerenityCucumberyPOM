package com.co.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"summary"},
        features = {"src/test/resources/features/"},
        glue = {"com.co.automation.stepdefinitions"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AutomationRunner {
}
