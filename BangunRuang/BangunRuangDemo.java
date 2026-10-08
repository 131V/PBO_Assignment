public class BangunRuangDemo{
    public static void main(String[] args){
        BangunRuang cube = new BangunRuang(4.0);

        BangunRuang box1 = new BangunRuang();
        box1.setLength(10.0);
        box1.setWidth(5.0);
        box1.setHeight(7.0);

        BangunRuang box2 = new BangunRuang(10.0, 5.0, 7.0);

        BangunRuang sphere = new BangunRuang();
        sphere.setRadius(3.0);

        System.out.printf("Volume of box (L=10, W=5, H=7) = %.1f\n", box2.calculateBoxVolume());
        System.out.printf("Surface area of cube (side=4) = %.1f\n", cube.calculateCubeSurfaceArea());
        System.out.printf("Volume of sphere (radius=3) = %.1f\n", sphere.calculateSphereVolume());
    }
}