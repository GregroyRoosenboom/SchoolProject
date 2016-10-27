package StepDefinitions;

import FirstPackage.SomeTestClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.TestCase;


public class MyStepdefs {

    private SomeTestClass test;

    @Given("^I have some test$")
    public void iHaveSomeTest() throws Throwable {
        test = new SomeTestClass();
    }

    @Then("^I have a test$")
    public void iHaveATest() throws Throwable {
        TestCase.assertEquals(true, test.getTrue(3));
    }

    @Then("^I do not get true$")
    public void iDoNotGetTrue() throws Throwable {
        TestCase.assertFalse(test.getTrue(7));
    }
}
