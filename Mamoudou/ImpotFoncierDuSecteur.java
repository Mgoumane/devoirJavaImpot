package Mamoudou;

import java.util.ArrayList;
import java.util.Vector;

public class ImpotFoncierDuSecteur {
	
	private String nomSecteur;
	private ArrayList <Habitation> lesHabitationsDuSecteur;
	
	public ImpotFoncierDuSecteur(String nomSecteur) {
		this.nomSecteur = nomSecteur;
		this.lesHabitationsDuSecteur = new ArrayList<>();
	}
	
	public boolean estEnregistre(Habitation uneHabitation) {
		for(Habitation h : lesHabitationsDuSecteur) {
			if (h.getProprietaire() == uneHabitation.getProprietaire() && h.getAdresse() == uneHabitation.getAdresse()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ajouterHabitation(Habitation uneHabitation) {
		if (estEnregistre(uneHabitation)) {
			return false;
		}
		lesHabitationsDuSecteur.add(uneHabitation);
		return true;
	}
	
	public double calculImpot() {
		double resultat = 0;
		for(Habitation h : lesHabitationsDuSecteur) {
			resultat = resultat + h.calculImpot();
		}
		return resultat;
	}
	
	public boolean supprimerHabitation(Habitation uneHabitation) {
		if (estEnregistre(uneHabitation)) {
			lesHabitationsDuSecteur.remove(uneHabitation);
			return true;
		}
		return false;
	}
	
	public String lireProprietaire(String adresse) {
		for(Habitation h : lesHabitationsDuSecteur) {
			if (h.getAdresse() == adresse) {
				return h.getProprietaire();
			}
		}
		return "Null";
	}
	
	public Vector<String> lireAdresses(String proprietaire) {
		
		Vector<String> lesAdressesDuProrietaire = new Vector<String>();
		for(Habitation h : lesHabitationsDuSecteur) {
			if (h.getProprietaire() == proprietaire) {
				lesAdressesDuProrietaire.addElement(h.getAdresse());
			}
		}
		return lesAdressesDuProrietaire;
	}
	
	
	public String getNomSecteur() {
		return nomSecteur;
	}
	
}
