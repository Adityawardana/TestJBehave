package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

/**
 * Created by Aditya on 18/01/2017.
 */
public class ItemDescription {
    @Steps
    EndUserSteps endUser;

    @Then("they should see the item description contains '$defin'")
    public void thenTheyShouldSeeTheItemDescriptionContains(String defin){
        endUser.should_see_description(defin);
    }
}
