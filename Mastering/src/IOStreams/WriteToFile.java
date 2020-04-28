package IOStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenovo\\Desktop\\JavaMasterClass\\Mastering\\src\\ap.txt");

        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("This is amazing!!");
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
