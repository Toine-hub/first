import java.util.Scanner;

public class M2E1 {
    public static void main(String[] args) {

        // Ouverture de la ressource clavier
        Scanner clavier = new Scanner(System.in);

        // Demande de saisie utilisateur
        System.out.print("Entrez un nombre : ");
        int nombre = clavier.nextInt();

        // Fermeture ressource clavier
        clavier.close();

        if (nombre % 2 == 0) {
            System.out.println(nombre + " est pair.");
        } else {
            System.out.println(nombre + " est impair.");
        }

    }
}