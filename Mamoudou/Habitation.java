package Mamoudou;

public abstract class Habitation {
	
	private String proprietaire, adresse, type;
	private double surface;
	public double impotFoncier;
	
	public Habitation(String proprietaire, String adresse, String type, double surface ) {
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.type = type;
		this.surface = surface;
	}
	
	public abstract double calculImpot();
	
	public void affiche() {
		System.out.println( proprietaire + " " + adresse + " " + getType() + " " + surface  );
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public double getSurface() {
		return surface;
	}

	public String getType() {
		return type;
	}
	
}
