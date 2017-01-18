package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

/**
 * Created by Aditya on 18/01/2017.
 */
public class SearchResults {
    @Steps
    EndUserSteps endUser;

    @Then("they should see a definition containing the words '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
}
