public class M3motif3 {
    public static void main(String[] args) {

        for (int numLigne = 1; numLigne <= 5; numLigne++) {
            for (int nbEtoiles = 1; nbEtoiles <= numLigne; nbEtoiles++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}