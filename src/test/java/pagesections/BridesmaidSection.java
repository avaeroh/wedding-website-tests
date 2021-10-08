package pagesections;

import net.serenitybdd.screenplay.targets.Target;

public class BridesmaidSection {

    public static final Target FAYE = Target.the("faye").locatedBy("img[src*='faye.jpg']");

    public static Target getBridesmaids(String string) {
        Target target;
        switch (string) {
            case "faye": target = FAYE;
                break;
            default: throw new UnsupportedOperationException("this option is not listed in the navigation items");
        }
        return target;
    }
}