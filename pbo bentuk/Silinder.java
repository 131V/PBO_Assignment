public class Silinder extends Lingkaran {

    private double tinggi;

    public Silinder(double tinggi, double radius, String warna){
        this.tinggi = tinggi;
        super(radius, warna);
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double hitungVolume(){
        return hitungLuas() * tinggi;
    }

    public void printInfo(){
        System.out.println("Silinder warna [" + warna + "], volume = [" + hitungVolume() + "]");
    }
}