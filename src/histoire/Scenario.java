package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais pr�parer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix",24);
		Gaulois asterix = new Gaulois("Ast�rix",4);
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos,ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus",20);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
