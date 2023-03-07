package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
		
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "
				+ effetPotion + "fois décuplée.");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " 
				+ romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);	
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom 
				+ ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix",8);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour");
		Romain cubitus= new Romain("Cubitus",6);
		asterix.frapper(cubitus);
		asterix.boirePotion(3);
		System.out.println(asterix);
		asterix.frapper(cubitus);
	}
}
