import java.util.TreeSet;


interface IPlanet{

    public String getName();

    public float getMass();

    public int getDiameter();

    public int getDensity();

    public double getGravity();

    public double getEscapeVelocity();

    public double getRotationPeriod();

    public double getDayLength();

    public double getDistanceFromSun();

    public double getPerihelion()

    public TreeSet getSatelliteSet();

    public Satellite getSatellite(String satelliteName);

    pubilc void addSatellite(Satellite objSat);

}