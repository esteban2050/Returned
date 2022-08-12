package com.toolsqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_toolsqa_spanish.feature"
        ,glue = "com.toolsqa.stepdefinitions"
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,monochrome = true //Para que aparezca mas legible los logs en consola
        ,dryRun = true //Sacara un error si algun paso del feature no esta definido en el stepdefinition
)
public class LoginToolSqa {
}
