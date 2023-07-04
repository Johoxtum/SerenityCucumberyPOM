package com.co.automation.stepdefinitions;

import com.co.automation.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;



import java.util.List;
import java.util.Map;

public class AutomationStep {

    @Steps
    RegisterStep registerStep;

    @Given("que Pablo ingresa a Automation Exercise")
    public void quePabloIngresaAAutomationExercise() {


        registerStep.abrirPagina();
    }
    @When("diligencia el formulario con los siguientes datos:")
    public void diligenciaElFormularioConLosSiguientesDatos(List<Map<String, String>> datos) {


        registerStep.diligenciarFormulario(datos);
    }

    @Then("debera visualizar {string}")
    public void deberaVisualizar(String account) {
        registerStep.validarRegistro1(account);
    }
}
