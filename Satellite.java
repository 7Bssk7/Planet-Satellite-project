public class Satellite implements ISatellite{

    private String sPlanetName;
    private String sName;
    private double sRadius;
    private double sDensity;
    private double sMagnitude;
    private double sGM;
    private double sAlbedo;

    Satellite(String PlanetName, String Name, double Radius, double Density, double Magnitude, double GM, double Albedo){
        this.sPlanetName = PlanetName;
        this.sName = Name;
        this.sRadius = Radius;
        this.sDensity = Density;
        this.sMagnitude = Magnitude;
        this.sGM = GM;
        this.sAlbedo = Albedo;
    }

    public String getPlanetName(){
        return sPlanetName;
    }

    public String getName(){
        return sName;
    }

    public double getGM(){// this is product of gravity times magnitude
        return sGM;
    } 


    public double getRadius(){
        return sRadius;
    }

    public double getDensity(){
        return sDensity;
    }

    public double getMagnitude(){
        return sMagnitude;
    }

    public double getAlbedo(){ // this is a brightness level
        return sAlbedo;
    }

}