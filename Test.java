import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeSet;

public class Test implements ITest, IFile{

    TreeMap<String, BufferedReader> fileList = new TreeMap<>();
    TreeSet<Planet> planetList = new TreeSet<>();
    Satellite s = new Satellite(null, null, 0, 0, 0, 0, 0);



    
    public BufferedReader openFile(String fileName){

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            fileList.put(fileName, br);

            return br;

        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());

            return null;
        }
        



    }

    public int closeFile(BufferedReader br){
        if(fileList.containsKey(br)){
            try{
                br.close();
                fileList.remove(br);
                return 0;

            }catch(IOException e){
                System.out.println("Error: " + e);

                return -1;

            }
        }
        else{
            return -1;
        }

    }


    public String getFileName(BufferedReader br){

        for(Map.Entry<String, BufferedReader> entry: fileList.entrySet()){
            if(br == entry.getValue()){
                return entry.getKey();
            }
        }

        return null;

    }

    public void initPlanetData(String fileName){
        BufferedReader br = openFile(fileName);
        String line;

        try{
            String header = br.readLine();
            while((line = br.readLine()) != null){
                String[] planetData = line.split(",");

                if(planetData.length >= 19){
                    Planet p = new Planet( planetData[0], Float.parseFloat(planetData[1].trim()), Integer.parseInt(planetData[2].trim()),
                Integer.parseInt(planetData[3].trim()), Double.parseDouble(planetData[4].trim()), Double.parseDouble(planetData[5].trim()),
                Double.parseDouble(planetData[6].trim()), Double.parseDouble(planetData[7].trim()), Double.parseDouble(planetData[8].trim()),
                Double.parseDouble(planetData[9].trim()), Double.parseDouble(planetData[10].trim()), Double.parseDouble(planetData[11].trim()),
                Double.parseDouble(planetData[12].trim()), Double.parseDouble(planetData[13].trim()), Double.parseDouble(planetData[14].trim()),
                Double.parseDouble(planetData[15].trim()), Integer.parseInt(planetData[16].trim()), planetData[17].trim(), Integer.parseInt(planetData[18].trim()),
                planetData[19].trim(), planetData[20].trim());
                    planetList.add(p);


                }

            }

        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }


    }  // opens the planet file and creates a list of planet objects and places it in a TreeSet

    public void initSatelliteData(String fileName){

        

    }   // opens the satellite file and creates a list of satellite objects and places it in a TreeSet

    public void showPlanetNames(){
        for(Planet p: planetList){
            System.out.println("- " + p.getName());
        }

    }  // List all of the planet names from top to bottom (e.g. each name listed as:  e.g. "- Earth")

    public void showSatelliteNames(){

    }  // List all of the satellite names from top to bottom (e.g. each name list as: e.g. "- Moon")    

}
