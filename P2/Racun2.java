public class Racun2 {
    /*
     * izracunaj ukupni racun za 2kg jbuka po 12KM 3kg krompira po 2KM i 50pf i 2kg
     * bresaka po 14KM
     */
    public static void main(String[] args) {
        /*kaze:  kreiraj varijablu total koja će sadrzavati vrijednost izraza 2∗1200 + 3∗250 + 2*1400 (=59500).*/
        /*Rijec int na pocetku pokazuje da je tip vrijednosti koju varijabla total može pohraniti je cjelobrojna vrijednost. */
        int total = 2*1200 + 3*250 + 2*1400;
        System.out.print("Racun je: ");
        System.out.print(total/100);
        System.out.print("KM i ");
        System.out.print(total%100);
        System.out.print(" pfeninga.");
    }
}