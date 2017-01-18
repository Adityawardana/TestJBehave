package TestingBlibli.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://www.blibli.com/")
public class HomePage extends PageObject {

    @FindBy(name="s")
    private WebElementFacade searchTerms;

    @FindBy(id="gdn-search-button")
    private WebElementFacade lookupButton;

    @FindBy(className = "insider-opt-in-notification")
    private WebElementFacade popup;

    @FindBy(className = "product-block")
    private WebElementFacade item;

    public void close_popup(){
        try {
            WebElement notifpopup = getDriver().findElement(By.xpath("//body//*[@class='insider-opt-in-notification-button-container']"));

            if (notifpopup.isDisplayed()){
                WebElement buttonnotif = getDriver().findElement(By.xpath("//div[contains(text(), 'Nanti saja')]"));
                buttonnotif.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
       lookupButton.click();
        //searchTerms.sendKeys(Keys.RETURN);
    }

    public void click_an_item() {
        item.click();
    }

    public String getDefinitions(String def) {
        WebElementFacade definitionList = find(By.xpath(".//*[@id='catalogProductListContentDiv']//*[div[contains(text(),'"+def+"')]]"));
        return definitionList.getText();
    }

    public String getDefinitionsofDescription(String descriptiontxt) {
        WebElementFacade descriptionList = find(By.xpath("//body//*[@id='blibli-main-ctrl']//section//div//section//h1[contains(text(),'"+descriptiontxt+"')]"));
//        .//*[@class='product-detail-info']
//        .//*[@id='blibli-main-ctrl']/section/div/div[1]/div[2]/div[1]/div[1]/div[2]/section/h1
        return descriptionList.getText();
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}