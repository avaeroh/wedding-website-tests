package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class GroomsmenSection {

    public static final Target CALLUM = Target.the("callum").locatedBy("#aboutUs .alt-background div:nth-child(2) > div > img");

    public static Target getGroomsman(String string) {
        Target target;
        switch (string) {
            case "callum": target = CALLUM;
                break;
            default: throw new UnsupportedOperationException("this option is not listed in the navigation items");
        }
        return target;
    }
}