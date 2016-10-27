package StepDefinitions;

import Classified.Classified;
import People.Person;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SellerVisitsClassified {

    private Person person1 = new Person("Piet", "piet@test.be");
    private Person person2 = new Person("Tom", "Tom@test.com");
    private Person loggedInPerson;

    private Classified classifiedToVisit;

    private Boolean rendersAsSeller;

    @Given("^I am logged in as seller (\\d+)$")
    public void iAmLoggedInAsSeller(int sellernr) throws Throwable {

        if (sellernr == 1) {
            this.loggedInPerson = person1;
        }
        else {
            this.loggedInPerson = person2;
        }
    }

    @When("^I go to the classified$")
    public void iGoToTheClassified() throws Throwable {
        rendersAsSeller = classifiedToVisit.userIsSeller(loggedInPerson);
    }

    @Then("^I should see the classified in visitor mode$")
    public void iShouldSeeTheClassifiedInVisitorMode() throws Throwable {
        Assert.assertFalse("expected the classified to be rendered as visitor but it was rendered as owner " + loggedInPerson.name() + rendersAsSeller.toString(), rendersAsSeller);
    }

    @And("^I open the edit mode$")
    public void iOpenTheEditMode() throws Throwable {
        // not implemented in codebase yet
    }

    @Then("^I should be on the edit classified page$")
    public void iShouldBeOnTheEditClassifiedPage() throws Throwable {
        Assert.assertTrue("should be owner ", rendersAsSeller);
    }

    @Given("^I am logged in as a buyer$")
    public void iAmLoggedInAsABuyer() throws Throwable {
        loggedInPerson = person2;
    }

    @Then("^I should be on the classified page$")
    public void iShouldBeOnTheClassifiedPage() throws Throwable {
        // not implemented yet
    }

    @And("^I should not be able to access the classified edit page$")
    public void iShouldNotBeAbleToAccessTheClassifiedEditPage() throws Throwable {
        Assert.assertFalse("expected the page to be as visitor not as owner", rendersAsSeller);
    }

    @Given("^there is a classified belonging to seller (\\d+)$")
    public void thereIsAClassifiedBelongingToSeller(int arg0) throws Throwable {

        this.classifiedToVisit = new Classified(person1);
    }
}
