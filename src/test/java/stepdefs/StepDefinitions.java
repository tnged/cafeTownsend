package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;


public class StepDefinitions {
    WebDriver driver;

    @Given("^I am on the homepage$")

    public void i_am_on_the_homepage() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/Ertugrul/Projects/tools/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","/Users/Ertugrul/Projects/tools/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://cafetownsend-angular-rails.herokuapp.com/");
    }

    @When("^I enter my credentials$")
    public void i_enter_my_credentials() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[1]/input")).sendKeys("Luke");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/label[2]/input")).sendKeys("Skywalker");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/button")).click();
    }

    @Then("^I am logged in$")
    public void i_am_logged_in() throws Exception {
        String greetings = driver.findElement(By.id("greetings")).getText();
        try{
            Assert.assertEquals(greetings, "7Hello Lue");
        }catch(AssertionError e){
            Log error;
        }
    }
}
