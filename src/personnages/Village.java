package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int reference) {
		return villageois[reference];
	}
	public void afficherVillageois() {
		System.out.println("Dans le " + nom + " du chef " + chef.getNom() +
				" vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+ villageois[i].getNom());
		}
	}
	public static void main(String[] args) {
		Village village= new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//On obtient une exception car un tableau de taille 30 à des indices de à à 29.
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix= new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//On obtient null car trouverHabitant(1) renvoit le gaulois à l'index 1,
		//or il n'y a pas encore de gaulois placé ici car le premier gaulois est
		//placé à l'indice 0.
		Gaulois obelix= new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
