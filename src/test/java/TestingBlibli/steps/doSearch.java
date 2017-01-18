package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;

/**
 * Created by Aditya on 18/01/2017.
 */
public class doSearch {
    @Steps
    EndUserSteps endUser;

    @When("the user looks up for '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }
}
