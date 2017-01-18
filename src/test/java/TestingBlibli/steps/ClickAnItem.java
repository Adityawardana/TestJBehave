package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

/**
 * Created by Aditya on 18/01/2017.
 */
public class ClickAnItem {
    @Steps
    EndUserSteps endUser;

    @When("I click the item")
    public void GivenIClickTheItem(){
        endUser.select_an_item();
    }
}
