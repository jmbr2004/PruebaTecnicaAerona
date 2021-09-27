package aeronautica.pageobject.login;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaResultadoAeronautica extends PageObject {

	@FindBy(xpath = "//*[@id=\\\"paging_container3\\\"]/ul/li[1]/div/div/a\")")
	WebElementFacade vinculoDescargaPDF;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseOxigen\\eclipseOxygenr\\eclipse-workspace\\PruebaTecnica\\src\\test\\resources\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.aerocivil.gov.co/atencion/presupuesto";
		driver.get(url);
		
		//WebElement hhh = driver.findElement(By.linkText("5. Presupuesto.​"));
		//WebElement hhh = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table/tbody/tr[4]/td/p/a"));   
		//
		WebElement hhh = driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table/tbody/tr[4]/td/p/a"));   
		System.out.println(hhh); 
		//je.executeScript("arguments[0].scrollIntoView(true);",hhh);
		
		
		/*String strUrl = driver.getCurrentUrl();

		boolean pdfContent = isPdfValid(strUrl);
		System.out.println(pdfContent); 
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.aerocivil.gov.co/atencion/presupuesto/estados-financieros";
		driver.get(url);
		
		
		WebElement hhh = driver.findElement(By.xpath("//*[@id=\"paging_container3\"]/ul/li[1]/div/div/a"));
		String bbbb = hhh.getAttribute("href");
		System.out.println(bbbb); */
	}
	
	public boolean validarPDF() {
		String vinculo = vinculoDescargaPDF.getAttribute("href");
		boolean isValid = isPdfValid(vinculo);
		return isValid;
	}

	public String obtenerURLPDF() {
		return vinculoDescargaPDF.getAttribute("href");
	}

	public boolean isPdfValid(String url) {
		URL pdfUrl;
		boolean isNull = true;
		@SuppressWarnings("unused")
		PDDocument doc = null;
		InputStream in = null;
		try {
			pdfUrl = new URL(url);
			in = new BufferedInputStream(pdfUrl.openStream());
			doc = PDDocument.load(in); 
			isNull = false;
			in.close();
		} catch (MalformedURLException e) {
			
		} catch (IOException e) {
			
		}
		return isNull;
	}
}
