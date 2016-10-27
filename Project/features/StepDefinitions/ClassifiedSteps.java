package StepDefinitions;

import People.Person;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Classified.Classified;
import org.junit.Assert;

public class ClassifiedSteps {
    private String description;
    private String title;
    private Double price;

    private Classified sellersItem;

    @When("^I open the classified$")
    public void iOpenTheClassified() throws Throwable {

    }


    @Given("^A classified with tile '(.*)' description '(.*)' and price € (\\d+)$")
    public void aClassifiedWithTileSomeTitleDescriptionATineBitOfTextForSomeContentAndPrice€(String title, String description, Double price) throws Throwable {
        this.title = title;
        this.description = description;
        this.price = price;

        sellersItem = new Classified(new Person("someSeller", "someSeller@test.com"), title, description, price );

    }

    @Then("^I see the correct price$")
    public void iSeeTheCorrectPrice() throws Throwable {
        Assert.assertEquals( this.price, sellersItem.getPrice(), 0.0);
    }

    @And("^I see the title$")
    public void iSeeTheTitle() throws Throwable {
        Assert.assertEquals("title did not match", title, sellersItem.getTitle());
    }

    @And("^I see the description$")
    public void iSeeTheDescription() throws Throwable {
        Assert.assertEquals("expected the descriptions to match but they didn't", this.description, sellersItem.getDescription());
    }
}
