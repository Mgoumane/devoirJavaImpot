package Mamoudou;

public class Percepteur {
	
	private String login;
	private String motDePasse;
	private ImpotFoncierDuSecteur leSecteur ;
	
	public Percepteur(String login, String motDePasse) {
		this.login = login;
		this.motDePasse = motDePasse;
	}

	public boolean ajouterHabitation(HabitationIndividuelle uneHabitationIndividuelle) {
		if (leSecteur.estEnregistre(uneHabitationIndividuelle)) {
			return false;
		}
		leSecteur.ajouterHabitation(uneHabitationIndividuelle);
		return true;
	}
	
	public boolean ajouterHabitation(HabitationProfessionnelle uneHabitationPro) {
		if (leSecteur.estEnregistre(uneHabitationPro)) {
			return false;
		}
		leSecteur.ajouterHabitation(uneHabitationPro);
		return true;
	}
	
	public boolean estLePercepteur(Percepteur p){
		if (login == p.login && motDePasse == p.motDePasse) {
			return true;
		}
		return false;
	}
	
	public double  calculerLesImpotsduSecteur() {
		return leSecteur.calculImpot();
	}
	
	
	// Getters And Setters
	public String getLogin() {
		return login;
	}
	public ImpotFoncierDuSecteur getLeSecteur() {
		return leSecteur;
	}
	public void setLeSecteur(ImpotFoncierDuSecteur leSecteur) {
		this.leSecteur = leSecteur;
	}
	
}
