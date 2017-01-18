package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

/**
 * Created by Aditya on 18/01/2017.
 */
public class CheckItemPage {
    @Steps
    EndUserSteps endUser;

    @Given("i have searched for local items containing '$defin'")
    public void givenIHaveSearchedForLocalItemsContaining(String defin) {
        endUser.should_see_page(defin);
    }
}
