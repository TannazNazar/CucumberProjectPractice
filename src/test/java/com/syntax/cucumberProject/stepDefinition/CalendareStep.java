package com.syntax.cucumberProject.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalendareStep {

	WebDriver driver;

	@When("^I click on calendare, New Event$")
	public void i_click_on_calendare_New_Event() throws Throwable {
		WebElement cal = driver.findElement(By.linkText("Calendar"));
		Actions act = new Actions(driver);
		act.moveToElement(cal).perform();
		
		WebElement NewEvent=driver.findElement(By.linkText("New Event"));
		Actions act1= new Actions(driver);
		act1.moveToElement(NewEvent).click().perform();
		
		
	}

	@When("^Fill out the title from date to date,choose important category$")
	public void fill_out_the_title_from_date_to_date_choose_important_category() throws Throwable {
		driver.findElement(By.id("title")).sendKeys("tester");
		driver.findElement(By.id("f_trigger_c_start")).click();
		driver.findElement(By.xpath("//div[@class='calendar']/table/tbody/tr[3]/td[8]"));
		
		
	}
}