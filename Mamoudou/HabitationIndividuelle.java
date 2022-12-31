package Mamoudou;

public class HabitationIndividuelle extends Habitation {
	
	private int nombrePieces;
	private boolean piscine;
	
	public HabitationIndividuelle(String proprietaire, String adresse, String type, double surface, int nombrePieces, boolean piscine) {
		super(proprietaire, adresse, type, surface);
		this.nombrePieces = nombrePieces;
		this.piscine = piscine;
	}

	public double calculImpot() {
		impotFoncier = nombrePieces * 100 + 5 * getSurface();
		if (piscine) {
			return impotFoncier + 500;
		}
		return impotFoncier;
	}
	
	public void affiche() {
		System.out.println("Propriétaire : " + getProprietaire() + ", Adresse : " + getAdresse() + ", Type : " + getType() + ", Surface : " + getSurface() + ", Nombre de pièce :  " + nombrePieces + ", Possède une piscine : " + piscine  );
	}
}
