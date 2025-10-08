public class cinema {
    public static void main(String[] args) {

        // Données en codées en dur pour les test
        int age = 12;
        boolean estAccompagneeParUnAdulte = true;
        boolean estInterdite = true;

        // Condition d'accès
        boolean peutEntrer = !estInterdite && (age >= 14 || estAccompagneeParUnAdulte);

        // Affichage du résultat
        if (peutEntrer) {
            System.out.println("Entrée autorisée");
        } else {
            System.out.println("Entrée refusée");
        }
    }
}
