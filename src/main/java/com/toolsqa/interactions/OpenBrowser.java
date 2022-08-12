package com.toolsqa.interactions;

import com.toolsqa.userinterface.ToolswaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {

    ToolswaHomePage toolswaHomePage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(toolswaHomePage));
    }

    public static Performable on() {
        return instrumented(OpenBrowser.class);
    }
}
