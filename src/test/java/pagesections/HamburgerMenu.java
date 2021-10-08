package pagesections;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class HamburgerMenu {

    static Target HAMBURGER_MENU = Target.the("hamburger menu")
            .locatedBy("#menuToggle");

    static Target GETTING_HERE = Target.the("getting here")
            .locatedBy("li a[href='#gettingHere'");

    static Target RSVP = Target.the("rsvp")
            .locatedBy(".menuLinks #rsvp");

    static Target BRIDESMAIDS = Target.the("bridesmaids")
            .locatedBy("li a[href='#bridesmaids'");

    static Target GROOMSMEN = Target.the("groomsmen")
            .locatedBy("li a[href='#groomsmen'");

    static Target OUR_STORY = Target.the("our story")
            .locatedBy("li a[href='#our-story'");

    public static Performable opens() {
        return Task.where("{0} opens the hamburger menu",
        Click.on(HAMBURGER_MENU));
    }

    public static Performable clicks(String navigationOption) {
        return Task.where("{0} clicks on the {navigationOption} link",
                Click.on(getNavigationItem(navigationOption)));
    }

    private static Target getNavigationItem(String string) {
        Target target;
        switch (string) {
            case "getting here": target = GETTING_HERE;
            break;
            case "rsvp": target = RSVP;
            break;
            case "bridesmaids": target = BRIDESMAIDS;
            break;
            case "groomsmen": target = GROOMSMEN;
            break;
            case "our story": target = OUR_STORY;
            break;
            default: throw new UnsupportedOperationException("this option is not listed in the navigation items");
        }
        return target;
    }

}
