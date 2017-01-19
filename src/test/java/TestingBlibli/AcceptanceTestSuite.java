package TestingBlibli;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Managed
    WebDriver driver;

    public AcceptanceTestSuite() {
        runSerenity().inASingleSession();
    }

    @Override
    public List<String> storyPaths() {
        List<String> storiesToRun = new ArrayList<String>();
//
//        storiesToRun.add(0, "stories/looking_for/LookupADefinition.story");
        storiesToRun.add(0, "stories/order_something/AddToCart.story");

        return storiesToRun;
    }
}
