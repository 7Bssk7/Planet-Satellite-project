import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class File implements IFile {
    TreeMap<BufferedReader, String> fileList = new TreeMap<>();


    
    
    public BufferedReader openFile(String fileName){

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            fileList.put(br, fileName);

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

        return fileList.get(br);

    }
}
