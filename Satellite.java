public class Satellite implements ISatellite{

    private String name;
    private double radius;

    public String getPlanetName();

    public String getName(){
        return name;
    }

    public double getGM(); // this is product of gravity times magnitude


    public double getRadius(){
        return radius;
    }

    public double getDensity();

    public double getMagnitude();

    public double getAlbedo(); // this is a brightness level

}