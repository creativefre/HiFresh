package be.kdg.hiFresh.domain.recept;


import java.sql.Timestamp;
import java.time.Duration;
import java.util.*;
import java.util.logging.Logger;
/**
 * @author Jan de Rijke.
 */
public class Recept {
	// TODO: implementeer klasse



	public Recept(
		String naam,
		Duration bereidingsTijd,
		int moeilijkheid,
		List<String> instructies,
		List<Ingredient> ingredienten
	) {

	}

	public void addLabel(Label label) {
		//TODO
	}


	public String getNaam() {
		//TODO
		return null;
	}
}
