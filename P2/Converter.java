public class Converter{
    public static void main(String[] args) {
    
    int usd = 180;
    int centa = 65;

    centa = 100*usd + centa;
    double bam = centa * 0.0159;

    //System.out.print("Iznos USD: ");
    System.out.print("Iznos BAM: ");
    System.out.print(bam);
    }
}