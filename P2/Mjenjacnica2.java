public class Mjenjacnica2 {
    public static void main(String[] args) {
        ConsoleReader in = new ConsoleReader(System.in);
        System.out.println("Unesi iznos Eura i centa:");
        System.out.print("Iznos u Eurima =");
        int eura = in.readInt();
        System.out.print("Iznos u Eurima =");
        int centa = in.readInt();

        centa = 100*eura + centa;
        double bam = centa * 0.0195;
        System.out.print("KM: ");
        System.out.print(bam);
    }
}