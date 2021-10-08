package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://jonandrach.co.uk")
public class WeddingHomePage extends PageObject {
    public static Performable theWeddingHomePage() {
        return Task.where("{0} opens the wedding home page",
                Open.browserOn().the(WeddingHomePage.class));
    }
}
