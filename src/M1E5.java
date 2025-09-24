import java.util.Random;
import java.util.Scanner;

public class M1E5  {
    public static void main(String[] args) {

        // Création d'un générateur de nombre aléatoires
        Random random = new Random();
        
        // Génère un nombre aléatoire entre 1 et 100 inclus
        int nombreMystere = random.nextInt(100) + 1;

        // Scanner pour lire la saisie utilisateur
        Scanner clavier = new Scanner(System.in);

        // Demande la saisie de l'utilisateur
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");

        // Lecture de la proposition de l'utilisateur
        int proposition = clavier.nextInt();

        // Fermeture de la ressource clavier
        clavier.close();

        // Affiche la proposition de l'utilisateur
        System.out.println("Vous proposez : " + proposition);

        // Affiche le nombre mystère
        System.out.println("Le nombre auquel je pensais était : " + nombreMystere);

        // Calcul de la différence (valeur absolue pour éviter les négatifs)
        int difference = Math.abs(nombreMystere - proposition);

        // Affiche la difference entre la proposition et la bonne réponse
        System.out.println("Vous étiez à " + difference + " de la bonne réponse.");

    }
}