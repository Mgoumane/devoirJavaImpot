package Mamoudou;

public class VilleTest {
	
	public static void Q13() {
		HabitationIndividuelle chezMoi = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		chezMoi.affiche();
		System.out.println("Impot foncier : " + chezMoi.calculImpot() + " euros");
	}
	
	public static void Q15() {
		HabitationProfessionnelle monTaf = new HabitationProfessionnelle("Société Goumane", "2 rue de Paris ", "Bureau", 133, 7);
		monTaf.affiche();
		System.out.println("Impot foncier : " + monTaf.calculImpot() + " euros");
	}
	
	public static void Q22() {
		
		HabitationIndividuelle habitation1 = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation2 = new HabitationIndividuelle("Awa Goumane", "3 rue Bruneseau", "Studio", 26, 1, false);
		
		ImpotFoncierDuSecteur secteurnord = new ImpotFoncierDuSecteur("secteurnord");
		
		secteurnord.ajouterHabitation(habitation1);
		secteurnord.ajouterHabitation(habitation2);
		
		System.out.println("Le total des impots de secteur nord est de : " + secteurnord.calculImpot() + " € ");
	}
	
	public static void Q23() {
		HabitationIndividuelle habitation1 = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation2 = new HabitationIndividuelle("Awa Goumane", "3 rue Bruneseau", "Studio", 26, 1, false);
		
		ImpotFoncierDuSecteur secteurnord = new ImpotFoncierDuSecteur("secteurnord");
		
		secteurnord.ajouterHabitation(habitation1);
		secteurnord.ajouterHabitation(habitation2);
		
		System.out.println("Le total des impots de secteur nord est de : " + secteurnord.calculImpot() + " € ");
		
		secteurnord.supprimerHabitation(habitation2);
		System.out.println("Le total des impots de secteur nord après la suppression de l'habitation2 est de : " + secteurnord.calculImpot() + " € ");
	}
	
	public static void Q24() {
		HabitationIndividuelle habitation1 = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation2 = new HabitationIndividuelle("Awa Goumane", "3 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation3 = new HabitationIndividuelle("Awa Goumane", "10 rue Bruneseau", "Studio", 26, 1, false);
		ImpotFoncierDuSecteur secteurnord = new ImpotFoncierDuSecteur("secteurnord");
		
		secteurnord.ajouterHabitation(habitation1);
		secteurnord.ajouterHabitation(habitation2);
		secteurnord.ajouterHabitation(habitation3);
	
		System.out.println("Le nom du propiétaire est : " + secteurnord.lireProprietaire("2 rue Bruneseau"));
		System.out.println("Le nom du propiétaire est : " + secteurnord.lireProprietaire("3 rue Bruneseau"));
		System.out.println("Le nom du propiétaire est : " + secteurnord.lireProprietaire("2 rue ..."));
		
		System.out.println("Les adresses de Awa sont : " + secteurnord.lireAdresses("Awa Goumane"));
		System.out.println("Les adresses de Mahmoudou sont : " + secteurnord.lireAdresses("Mahmoudou Goumane"));
		System.out.println("Les adresses de Inconnu sont : " + secteurnord.lireAdresses(" Inconnu "));
	}
	
	public static void Q32() {
		
		HabitationIndividuelle habitation1 = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation2 = new HabitationIndividuelle("Awa Goumane", "3 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation3 = new HabitationIndividuelle("Awa Goumane", "10 rue Bruneseau", "Studio", 26, 1, false);
		HabitationProfessionnelle monTaf = new HabitationProfessionnelle("Société Goumane", "2 rue de Paris ", "Bureau", 133, 7);
		HabitationIndividuelle palaisElysee = new HabitationIndividuelle("Emmanuel Macron", "55 Rue du Faubourg Saint-Honoré", "Chateau", 1000, 10, false);
	
		
		ImpotFoncierDuSecteur secteurnord = new ImpotFoncierDuSecteur("secteurnord");
		
		secteurnord.ajouterHabitation(habitation1);
		secteurnord.ajouterHabitation(habitation2);
		secteurnord.ajouterHabitation(habitation3);
		
		Percepteur monsieurDupont = new Percepteur("md", "md");
		Percepteur monsieurLemars = new Percepteur("ml", "ml");
		
		monsieurDupont.setLeSecteur(secteurnord);
		
		System.out.println("Le total des impots du secteur de Monsieur Dupont est de " + monsieurDupont.calculerLesImpotsduSecteur());
		
		monsieurDupont.ajouterHabitation(monTaf);
		monsieurDupont.ajouterHabitation(palaisElysee);
		System.out.println("Le total des impots du secteur de Monsieur Dupont après l'ajout ci-dessus est de  " + monsieurDupont.calculerLesImpotsduSecteur());
	
		System.out.println("Est le percepteur : " + monsieurDupont.estLePercepteur(monsieurDupont));
		System.out.println("Est le percepteur : " + monsieurDupont.estLePercepteur(monsieurLemars));
	}
	
	public static void Q42() {
		
		LesPercepteurs lesPercepteurs1 = new LesPercepteurs();
		Percepteur percepteur1 = new Percepteur("picsou", "radin");
		
		System.out.println("Est percepteur : " + lesPercepteurs1.isPercepteur(percepteur1));
		
		HabitationIndividuelle habitation1 = new HabitationIndividuelle("Mahmoudou Goumane", "2 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation2 = new HabitationIndividuelle("Awa Goumane", "3 rue Bruneseau", "Studio", 26, 1, false);
		HabitationIndividuelle habitation3 = new HabitationIndividuelle("Awa Goumane", "10 rue Bruneseau", "Studio", 26, 1, false);
		HabitationProfessionnelle monTaf = new HabitationProfessionnelle("Société Goumane", "2 rue de Paris ", "Bureau", 133, 7);
		HabitationIndividuelle palaisElysee = new HabitationIndividuelle("Emmanuel Macron", "55 Rue du Faubourg Saint-Honoré", "Chateau", 1000, 10, false);
		
		if (lesPercepteurs1.isPercepteur(percepteur1)) {
			percepteur1.ajouterHabitation(habitation1);
			percepteur1.ajouterHabitation(habitation2);
			percepteur1.ajouterHabitation(habitation3);
			percepteur1.ajouterHabitation(monTaf);
			percepteur1.ajouterHabitation(palaisElysee);
			System.out.println(percepteur1.calculerLesImpotsduSecteur());
		}	
	}
	
	public static void main(String[] args) {
//		Q13();
//		Q15();
//		Q22();
//		Q23();
//		Q24();
//		Q32();
//		Q42();
		
	}
}
