package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

/**
 * Created by Aditya on 18/01/2017.
 */
public class CheckHomePage {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Blibli home page")
    public void givenTheUserIsOnTheBlibliHomePage() {
        endUser.is_the_home_page();
    }
}
