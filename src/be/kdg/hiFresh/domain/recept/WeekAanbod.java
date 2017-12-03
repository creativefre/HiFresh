package be.kdg.hiFresh.domain.recept;

import org.threeten.extra.YearWeek;

import java.util.*;

/**
 * @author Jan de Rijke.
 * Weekaanbod met geordende recepten
 * Het eerste recept staat op plaats 1
 */


public class WeekAanbod {
	// TODO: implementeer klasse

	public static final int SIZE =10;

  public WeekAanbod(YearWeek week, double prijs) {
	  // TODO

  }



	/**
	 *
	 * @param recept recept dat toegevoegd moet worden
	 * @param plaats plaats in de lijst. Eventueel bestaande recepten worden naar onder geshift
	 * @return Indien een recept uit de lijst valt omdat het voorbij de maximum size geshift wordt,
	 * wordt dit gereturned, anders returns null
	 */
	public Recept voegToe(Recept recept,int plaats){
		// TODO
		return null;
	}


	public  Map<Integer,Recept>  getRecepten() {
		return null;
	}
}
