package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class Register implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(HomePage.BNT_USERICON),
                Click.on(HomePage.BNT_REGISTERSECTION)
        );
    }

    public static Register enter()
    {
        return Tasks.instrumented(Register.class);
    }
}
