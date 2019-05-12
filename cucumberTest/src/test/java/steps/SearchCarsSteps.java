package steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;


public class SearchCarsSteps {
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions= new CarSearchPageActions();
	
	
	
	
	@Given("^I am on the Home Page \"(.*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) {
		String menu=list.get(1);
		System.out.println("Menu-->"+menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}


}
