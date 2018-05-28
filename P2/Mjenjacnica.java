public class Mjenjacnica {
    public static void main(String[] args) {
        /*preracunaj Eure u KM*/
        int eura = 135;
        int centa = 30;

        centa = 100*eura + centa;
        double km = centa * 0.01950;
        System.out.print("KM ");
        System.out.print(km);
    }
}