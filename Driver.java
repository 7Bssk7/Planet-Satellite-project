

public class Driver{
    public static void main(String[] args){
        Test test1 = new Test();

        test1.initPlanetData("planets.csv");
        test1.showPlanetNames();

    }
}