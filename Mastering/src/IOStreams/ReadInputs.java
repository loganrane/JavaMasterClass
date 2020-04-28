package IOStreams;

import java.io.*;

public class ReadInputs {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.print("Enter some characters : ");
        System.in.read(data);
        System.out.print("You entered : ");

        for(int i=0;i<data.length;i++){
            System.out.print((char)data[i]);
        }

        File file = new File("C:\\Users\\lenovo\\Desktop\\JavaMasterClass\\Mastering\\src\\Test.txt");
        // Dealing with bytes here.
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            System.out.println("Total size : " + fileInputStream.available());

            int content;
            while((content = fileInputStream.read()) != -1){
                System.out.print((char) content);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // BufferReader
        // Above bytes, strings.
        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
