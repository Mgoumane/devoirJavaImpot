package Mamoudou;

import java.util.HashMap;

public class LesPercepteurs {
	
	private HashMap<String, Percepteur> listepercepteurs ;
	private HashMap<String, ImpotFoncierDuSecteur> lessecteurs ;

	public LesPercepteurs() {
		
		listepercepteurs = new HashMap<>();
		lessecteurs = new HashMap<>();
		
		listepercepteurs.put("picsou", new Percepteur("picsou", "radin"));
		listepercepteurs.put("donald", new Percepteur("donald", "coincoin"));
		listepercepteurs.put("pluto", new Percepteur("pluto", "comptemesos"));
		listepercepteurs.put("mickey", new Percepteur("mickey", "lemalin"));
		listepercepteurs.put("daisy", new Percepteur("daisy", "bijoux"));
		
		lessecteurs.put("picsou", new ImpotFoncierDuSecteur("secteurnord"));
		lessecteurs.put("pluto", new ImpotFoncierDuSecteur("secteursud"));
		lessecteurs.put("donald", new ImpotFoncierDuSecteur("secteurest"));
		lessecteurs.put("mickey", new ImpotFoncierDuSecteur("secteurouest"));
		lessecteurs.put("daisy", new ImpotFoncierDuSecteur("secteurcentre"));
		
	}
	
	public boolean isPercepteur(Percepteur percepteur) {
//		-vérifier que le percepteur passé en argument est bien identifié – Login et mot de passe –,
//		-positionner alors le bon secteur dans l’attribut Lesecteur du percepteur passé en argument,
//		-retourner true si tout se passe bien.
		
		
		if ( listepercepteurs.containsKey(percepteur.getLogin())) {
			percepteur.setLeSecteur(lessecteurs.get(percepteur.getLogin()));
			return true;
		}
		return false;
		
	}
}
