package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theWeddingHomePage() {
        return Task.where("{0} opens the wedding home page",
                Open.browserOn().the(WeddingHomePage.class));
    }
}
