package TestingBlibli.steps.serenity;

import TestingBlibli.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void close_the_popup() {
        homePage.close_popup();
    }

    @Step
    public void enters(String keyword) {
        homePage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        homePage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(homePage.getDefinitions(definition), containsString(definition));
    }

    @Step
    public void should_see_page(String defin) {
        assertThat(homePage.getDefinitionsPage(defin), containsString(defin));
    }

    @Step
    public void should_see_description(String defin) {
        assertThat(homePage.getDefinitionsofDescription(defin), containsString(defin));
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void select_an_item(){
        homePage.click_an_item();
    }
//    // shopping cart
//    ItemDetailsPage detailsPage
//    CartPage cartPage
//
//    @Step
//    public void selects_any_products_variations() {
//        detailsPage.getProductVariationIds().stream()
//                .forEach(id -> detailsPage.selectVariation(id,2));
//    }
//
//    @Step
//    public void adds_current_item_to_shopping_cart() {
//        detailsPage.addToCart();
//    }
//
//    @Step
//    public void should_see_item_in_cart(ListingItem selectedItem) {
//        assertThat(cartPage.getOrderCostSummaries()
//                .stream().anyMatch(order -> order.getName().equals(selectedItem.getName()))).isTrue();
//    }
}