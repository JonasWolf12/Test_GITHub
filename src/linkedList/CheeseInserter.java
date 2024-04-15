
package linkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {

	// private = Sichtbarkeit auf die eigene Klasse beschr�nkt
	// static = unabh�ngig von einem Objekt, geh�rt zur Klasse
	// final = Wert der Variable bleibt nach Initialisierung unver�ndert 
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?|Melanzani"
			);
	
	
	
	public static void insertCheeseAroundVegetables(List<String> ingredients) {
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			// Auslesen der momentanen Zutat
			String ingredient = iterator.next();
			// �berpr�fen, obt die Zutat zu unserem Vegetables- Pattern passt
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
	}
	
	
	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln", "Melanzani");
		insertCheeseAroundVegetables(ingredients);
		System.out.println(ingredients);
		

	}

}
