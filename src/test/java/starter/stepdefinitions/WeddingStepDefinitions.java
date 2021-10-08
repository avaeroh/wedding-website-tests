package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import pageSegments.BridesmaidSection;
import pageSegments.GroomsmenSection;
import pageSegments.HamburgerMenu;

import java.time.Duration;

public class WeddingStepDefinitions {


    @When("{actor} opens the hamburger menu")
    public void opensTheHamburger(Actor actor) {
        actor.attemptsTo(HamburgerMenu.opens());
    }

    @When("{actor} clicks on the {string} link")
    public void clicksTheLink(Actor actor, String string) {
        actor.attemptsTo(HamburgerMenu.clicks(string));
    }

    @Then("{actor} should see {string} in the groomsman section")
    public void shouldSeeGroomsmen(Actor actor, String string) {
        actor.attemptsTo(
                Ensure.that(GroomsmenSection.getGroomsman(string).
                        waitingForNoMoreThan(Duration.ofSeconds(5)))
                        .isDisplayed()
        );
    }

    @Then("{actor} should see {string} in the bridesmaids section")
    public void shouldSeeBridesmaids(Actor actor, String string) {
        actor.attemptsTo(
                Ensure.
                        that(BridesmaidSection.getBridesmaids(string)
                        .waitingForNoMoreThan(Duration.ofSeconds(5)))
                        .isDisplayed()
        );
    }

}
