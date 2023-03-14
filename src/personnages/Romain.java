package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		assert force > 0;
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
		assert force > 0;
		int oldForce = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("Jabandonne...");
		}
		assert force < oldForce;
	}
	public static void main(String[] args) {
		Romain cubitus= new Romain("Cubitus",6);
		System.out.println(cubitus.prendreParole());
		cubitus.parler("Bonjour");
		cubitus.recevoirCoup(3);
		cubitus.recevoirCoup(3);
	}
}
