package IOStreams;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Taking the user input
        System.out.println("Enter the lines : ");
        String[] input = new String[5];
        for(int i=0; i<5; i++) input[i] = sc.nextLine();

        // Adding the data into the files.
        String file_path_destination = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\letter.txt";
        File dest_file = new File(file_path_destination);

        // Writing into the file.
        try(FileWriter output_dest = new FileWriter(dest_file)){

            for(int i=0; i<5; i++){
                output_dest.write(input[i]);
                output_dest.write("\n");
            }
            System.out.println("Data is recorded.");
        } catch (IOException e){
            e.printStackTrace();
        }

        // Reading the file and displaying the results.
        try(FileInputStream input_dest = new FileInputStream(dest_file)){
            System.out.println("The size of content is : " + input_dest.available());
            int content;
            while((content = input_dest.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // Deleting the result.
        if(dest_file.delete()){
            System.out.println("File deleted successfully.");
        }
    }
}