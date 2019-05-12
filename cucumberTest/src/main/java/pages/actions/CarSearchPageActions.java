package pages.actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	//WebDriver driver=null;
	
	CarSearchPageLocators CarSearchPageLocators=null;
	public  CarSearchPageActions()
	{
		//this.driver=driver;
		this.CarSearchPageLocators= new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarSearchPageLocators);
	}


	
	
}
