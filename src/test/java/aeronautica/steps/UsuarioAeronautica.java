package aeronautica.steps;

import static org.junit.Assert.assertTrue;

import aeronautica.pageobject.login.PaginaPrincipalAeronautica;
import aeronautica.pageobject.login.PaginaResultadoAeronautica;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class UsuarioAeronautica extends ScenarioActor {

	String actor;

	@Steps (shared = true)
	PaginaPrincipalAeronautica paginaPrincipal;

	@Steps (shared = true)
	PaginaResultadoAeronautica paginaResultado;

	@Step("#actor ingresa a la pagina de Aeronaútica civil")
	public void ingresarAeronautica() {
		paginaPrincipal.setDefaultBaseUrl("https://www.aerocivil.gov.co/");
		paginaPrincipal.open();
	}

	@Step("#actor accede a las opciones de Trasparencia, Presupuesto, estados finacieros, Balance y estado situacion finaciera de abril")
	public void accederOpcionEstadoFinanciero() {
		paginaPrincipal.irTransparencia();
		paginaPrincipal.irPresupuesto();
		paginaPrincipal.irEstadoFinanciero();
		//paginaPrincipal.irBalance();
		//paginaPrincipal.irEstadoFinaniero();
	}

	@Step("#actor valida que el PDF sea correcto: {0}")
	public void validaPDFVal() {
		//boolean isValidPDF = paginaResultado.validarPDF();		
		//assertTrue(isValidPDF); 
	} 
}
