import java.util.Scanner;

public class Texteatrous {
    public static void main(String[] args) throws Exception {

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        // Récupérer un premier nom commun
        System.out.print("Entrez un nom commun : ");
        String nomCommun1 = clavier.next();

        // Récupéreration d'un nombre
        System.out.print("Entrez un nombre : ");
        int nombre = clavier.nextInt();

        // Récupéreration d'un deuxième nom commun
        System.out.print("Entrez un second nom commun : ");
        String nomCommun2 = clavier.next();

        // Récupéreration d'un adjectif
        System.out.print("Entrez un adjectif : ");
        String adjectif = clavier.next();

        // On "ferme" la ressource clavier
        clavier.close();

        // Affichage du résultat "Il était une fois un NOM1 qui avait NOMBRE NOM2. Cela le rendait très ADJECTIF"
        System.out.println("Il était une fois un " + nomCommun1 + " qui avait " + nombre + " " + nomCommun2 + ". Cela le rendait très " + adjectif + ".");
    }
}
