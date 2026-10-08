public class MainBentuk {
    public static void main (String[] args){

        Bentuk bentuk = new Bentuk("merah");

        BujurSangkar bujursangkar = new BujurSangkar(10, "kuning");

        Lingkaran lingkaran = new Lingkaran(20, "hijau");

        Silinder silinder = new Silinder(30, 40, "biru");

        bentuk.printInfo();
        bujursangkar.printInfo();
        lingkaran.printInfo();
        silinder.printInfo();
    }
}