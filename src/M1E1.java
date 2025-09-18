public class M1E1  {
    public static void main(String[] args) {
        
        // 1. Déclaration des variables avec des valeurs "en dur"
        int heures = 12;
        int minutes = 34;
        int secondes = 56;

        // 2. Calcul du nombre total de secondes depuis minuit
        int totalSecondes = (heures * 3600) + (minutes * 60) + secondes;

        // 3. Affichage du résultat
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + totalSecondes + " secondes depuis minuit.");
    }
}