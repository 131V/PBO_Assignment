public class BangunRuang{
    private double side;
    private double length;
    private double width;
    private double height;
    private double radius;

    public BangunRuang(){
    }

    public BangunRuang(double side){
        this.side = side;
    }

    public BangunRuang(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateCubeSurfaceArea(){
        return 6.0 * (side * side);
    }

    public double calculateBoxSurfaceArea(){
        return 2.0 * ((length * width) + (length * height) + (width * height));
    }

    public double calculateSphereSurfaceArea(){
        return 4.0 * Math.PI * (radius * radius);
    }

    public double calculateCubeVolume(){
        return Math.pow(side, 3);
    }

    public double calculateBoxVolume(){
        return length * width * height;
    }

    public double calculateSphereVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
