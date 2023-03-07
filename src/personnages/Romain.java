package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("Jabandonne...");
		}
	}
	public static void main(String[] args) {
		Romain cubitus= new Romain("Cubitus",6);
		System.out.println(cubitus.prendreParole());
		cubitus.parler("Bonjour");
		cubitus.recevoirCoup(3);
		cubitus.recevoirCoup(3);
	}
}
