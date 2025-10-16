import java.util.Scanner;

public class M1E2 {
    public static void main(String[] args) {

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        // 1. Récupérer les heures, minutes, secondes de l'utilisateur
        System.out.println("Entrez les heures : ");
        int heures = clavier.nextInt();
        System.out.println("Entrez les minutes : ");
        int minutes = clavier.nextInt();
        System.out.println("Entrez les secondes : ");
        int secondes = clavier.nextInt();
        clavier.close();

        // 2. Afficher l'heure statique
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");

        // 3. Afficher le nombre de secondes écoulées depuis minuit
        int nbSecondesDepuisMinuit = (heures * 60);
    }
}