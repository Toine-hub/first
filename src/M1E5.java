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
    }
}