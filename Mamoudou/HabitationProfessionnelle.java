package Mamoudou;

public class HabitationProfessionnelle extends Habitation{
	
	private int nombreEmployees;
	
	public HabitationProfessionnelle(String proprietaire, String adresse, String type, double surface,  int nombreEmployees) {
		super(proprietaire, adresse, type, surface);
		this.nombreEmployees = nombreEmployees;
	}

	public double calculImpot() {
		
		float nbEmployes = nombreEmployees;
		float diviseur =10;
		double tranche = Math.ceil( nbEmployes / diviseur);
		impotFoncier = tranche * 300 + getSurface() * 10;
		return impotFoncier;
	}
	

	public void affiche() {
		System.out.println("Propriétaire : " + getProprietaire() + ", Adresse : " + getAdresse() + ", Type : " + getType() + ", Surface : " + getSurface() + ", Nombre d'employés :  " + nombreEmployees );
	}

}
