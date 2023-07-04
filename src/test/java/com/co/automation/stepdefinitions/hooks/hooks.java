package com.co.automation.stepdefinitions.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class hooks {
    @Before
    public void setTheStageWeb(Scenario scenario) {

        OnStage.setTheStage(new OnlineCast());
        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());

    }
}
