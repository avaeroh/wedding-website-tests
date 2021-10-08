package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;

public class SearchStepDefinitions {


    @Given("{actor} navigates to the wedding website")
    public void navigatesToWeddingWebsite(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWeddingHomePage());
    }

}
