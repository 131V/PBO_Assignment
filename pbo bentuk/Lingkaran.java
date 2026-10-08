public class Lingkaran extends Bentuk{

    public static final double PHI = 3.14159265359;

    private double radius;

    public Lingkaran(double radius, String warna){
        this.radius = radius;
        super(warna);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double hitungLuas(){
        return PHI * (radius * radius);
    }

    public void printInfo(){
        System.out.println("Lingkaran [" + warna + "], luas = [" + hitungLuas() + "]");
    }
}