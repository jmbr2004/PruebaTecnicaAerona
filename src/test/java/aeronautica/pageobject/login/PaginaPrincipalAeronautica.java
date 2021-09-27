package aeronautica.pageobject.login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.aerocivil.gov.co/")
public class PaginaPrincipalAeronautica extends PageObject {
	
	@FindBy(linkText = "Transparencia")
	WebElementFacade opcTrasparencia;

	@FindBy(xpath = "//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table[2]/tbody/tr[5]/td/a")
	WebElementFacade opcPresupuesto;

	//@FindBy(id = ".//*[@id='ctl00_PlaceHolderMain_MenuThirdLevel']//ul//li[3]", className = "ms-rteTable-0")
	@FindBy(xpath=".//*[@id='ctl00_PlaceHolderMain_MenuThirdLevel']//ul//li[3]//a")
	//tbody/tr[4]/td[1]/p[1]/a[1]   - .//*[@id='ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField']//tr[4]/td[1]/p[1]/a[1]-.//*[@id='ctl00_PlaceHolderMain_MenuThirdLevel']//ul//li[3]//a
	//Estados financieros
	WebElementFacade opcEstFinanci;

	@FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/h3[1]")
	//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/h3[1]
	WebElementFacade opcBalance;

	@FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")
	////body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]
	WebElementFacade opcEstFinanImag;

	public void irTransparencia() {
		opcTrasparencia.click();
	}

	public void irPresupuesto() {
		opcPresupuesto.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("deprecation")
	public void irEstadoFinanciero() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
			
		//Step 1
               //Step 2
        
			
			opcEstFinanci.waitUntilClickable().click();
	        
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	

	public void irBalance() {
		opcBalance.click();
	}

	public void irEstadoFinaniero() {
		opcEstFinanImag.click();
	}
}
