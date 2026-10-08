public class BujurSangkar extends Bentuk {

    private double sisi;
    
    public BujurSangkar(double sisi, String warna){
        this.sisi = sisi;
        super(warna);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }

    public void printInfo(){
        System.out.println("Bujursangkar berwarna [" + warna + "], luas = [" + hitungLuas() + "]");
    }
}