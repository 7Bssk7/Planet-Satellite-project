import java.util.TreeSet;

public class Planet implements IPlanet, Comparable<Planet>{
    private String pName;
    private float pMass;
    private int pDiameter;
    private int pDensity;
    private double pGravity;
    private double pEscapeVelocity;
    private double pRotationPeriod;
    private double pDayLength;
    private double pDistanceFromSun;
    private double pPerihelion;
    private double pAphelion;
    private double pOrbitalPeriod;
    private double pOrbitalVelocity;
    private double pOrbitalInclination;
    private double pOrbitalEccentricity;
    private double pObliquityToOrbit;
    private int pMeanTemperature;
    private String pSurfacePressure;
    private int pNumberOfMoons;
    private String pHasRingSystem;
    private String pHasGlobalMagneticField;

    private TreeSet<Satellite> pSatelliteSet = new TreeSet<>();

    Planet(String Name, float Mass, int Diameter, int Density, double Gravity,
        double EscapeVelocity, double RotationPeriod, double DayLength, double DistanceFromSun,
        double Perihelion, double Aphelion, double OrbitalPeriod, double OrbitalVelocity, double OrbitalInclination, double OrbitalEccentricity,
        double ObliquityToOrbit, int MeanTemperature, String SurfacePressure, int NumberOfMoons, String HasRingSystem, String HasGlobalMagneticField){

        pName = Name;
        pMass = Mass;
        pDiameter = Diameter;
        pDensity = Density;
        pGravity = Gravity;
        pEscapeVelocity = EscapeVelocity;
        pRotationPeriod = RotationPeriod;
        pDayLength = DayLength;
        pDistanceFromSun = DistanceFromSun;
        pPerihelion = Perihelion;
        pAphelion = Aphelion;
        pOrbitalPeriod = OrbitalPeriod;
        pOrbitalVelocity = OrbitalVelocity;
        pOrbitalInclination = OrbitalInclination;
        pOrbitalEccentricity = OrbitalEccentricity;
        pObliquityToOrbit = ObliquityToOrbit;
        pMeanTemperature = MeanTemperature;
        pSurfacePressure = SurfacePressure;
        pNumberOfMoons = NumberOfMoons;
        pHasRingSystem = HasRingSystem;
        pHasGlobalMagneticField = HasGlobalMagneticField; 

    }

    public String getName(){
        return pName;
    }

    public float getMass(){
        return pMass;
    }

    public int getDiameter(){
        return pDiameter;
    }

    public int getDensity(){
        return pDensity;
    }

    public double getGravity(){
        return pGravity;
    }

    public double getEscapeVelocity(){
        return pEscapeVelocity;
    }

    public double getRotationPeriod(){
        return pRotationPeriod;
    }

    public double getDayLength(){
        return pDayLength;
    }

    public double getDistanceFromSun(){
        return pDistanceFromSun;

    }

    public double getPerihelion(){
        return pPerihelion;

    }

    public TreeSet<Satellite> getSatelliteSet(){
        return pSatelliteSet;

    }

    public Satellite getSatellite(String satelliteName){
        for(Satellite s: pSatelliteSet){
            if(satelliteName.equalsIgnoreCase(s.getName())){
                return s;
            }
        }

        return null;

    }

    public void addSatellite(Satellite objSat){
        pSatelliteSet.add(objSat);
    }

    @Override
    public int compareTo(Planet p){
        return this.pName.compareTo(p.getName());
    }


}