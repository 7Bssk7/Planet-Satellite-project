import java.util.TreeSet;

public class Planet implements IPlanet{
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
    private TreeSet<Satellite> pSatelliteSet = new TreeSet<>();


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


}