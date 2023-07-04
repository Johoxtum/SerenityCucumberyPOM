package com.co.automation.steps;

import com.co.automation.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import java.util.List;
import java.util.Map;

public class RegisterStep {

    private RegisterPage registerPage;

    @Step
    public void abrirPagina(){

        registerPage.open();
    }

    @Step
    public void diligenciarFormulario(List<Map<String, String>> datos){

        Map<String, String> primerDatos = datos.get(0);
        String name = primerDatos.get("name");
        String email = primerDatos.get("email");
        String password = primerDatos.get("password");
        String day = primerDatos.get("day");
        String month = primerDatos.get("month");
        String year = primerDatos.get("year");
        String firstName = primerDatos.get("firstName");
        String lastName = primerDatos.get("lastName");
        String company = primerDatos.get("Company");
        String address = primerDatos.get("address");
        String state = primerDatos.get("state");
        String city = primerDatos.get("City");
        String zipcode = primerDatos.get("Zipcode");
        String mobileNumber = primerDatos.get("MobileNumber");
        registerPage.Registrar(name, email, password,day,month,year, firstName, lastName, company, address, state, city, zipcode, mobileNumber);
    }
    @Step
    public void validarRegistro1(String account){

        Assert.assertEquals(registerPage.validarRegistro(),account);
    }
}
