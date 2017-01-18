package TestingBlibli.steps;

import TestingBlibli.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

/**
 * Created by Aditya on 18/01/2017.
 */
public class CloseThePopup {
    @Steps
    EndUserSteps endUser;

    @Given("the popup is appear")
    public void givenThePopupIsAppear(){
        endUser.close_the_popup();
    }
}
