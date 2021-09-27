package stepsDefinitions;
import aeronautica.steps.UsuarioAeronautica;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Steps;

public class UsuarioDefinicionesDePasos {

	@Steps(shared = true)
	UsuarioAeronautica usuario;

	@Dado("^Que \"([^\"]*)\" entra a la pagina de Aeronaútica civil$")
	public void que_entra_a_la_pagina_de_Aeronaútica_civil(String nombreDeUsuario) {
		usuario.isCalled(nombreDeUsuario);
		//usuario.attemptsTo(Scroll.to(WatchedHistoryItem.HEADING));
		usuario.ingresarAeronautica();
	}

	@Cuando("^(.*) accede a las opciones de Trasparencia, Presupuesto, estados finacieros, Balance y estado situacion finaciera de abril$")
	public void accede_opcione_estad_finan(String nombreDeUsuario) {
		usuario.isCalled(nombreDeUsuario);
		usuario.accederOpcionEstadoFinanciero();
	}

	@Entonces("^\"([^\"]*)\" valida que el PDF sea correcto$")
	public void valida_que_el_PDF_sea_correcto(String nombreDeUsuario) {
		usuario.isCalled(nombreDeUsuario);
		//usuario.validaPDFVal();
	}
}
