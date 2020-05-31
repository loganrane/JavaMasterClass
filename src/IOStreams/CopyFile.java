package IOStreams;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Taking the file names as input
        System.out.print("Enter the source file name : ");
        String source = sc.nextLine();
        System.out.print("Enter the destination file name : ");
        String dest = sc.nextLine();

        // Joining to the correct file path to the specified folder
        String file_path_source = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\" + source;
        String file_path_destination = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\" + dest;

        // Loading the files
        File source_file = new File(file_path_source);
        File dest_file = new File(file_path_destination);

        // Variable to store the read data
        StringBuilder content_source = new StringBuilder();

        // Reading the contents of source file
        try (FileInputStream input_source = new FileInputStream(source_file)){
            int content;
            while((content = input_source.read()) != -1){
                // Convert to char and store
                StringBuilder append = content_source.append((char) content);
            }
        } catch (FileNotFoundException e){
            // Error message if we can't find the source file.
            System.out.println("File not found inside the folder.");
        }

        if(dest_file.exists()){
            System.out.print("Do you want to overwrite the file? yes / no : ");
            String ans = sc.nextLine();
            if(ans.equals("yes")){
                // Overwriting the data.
                try(FileWriter output_dest = new FileWriter(dest_file)){
                    output_dest.write(String.valueOf(content_source));
                    output_dest.close();
                    System.out.println("Data overwritten in the file.");
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            else{
                // Nothing to do now.
                System.out.println("Exiting without writing.");
            }
        } else{
            try(FileWriter output_dest = new FileWriter(dest_file)){
                output_dest.write(String.valueOf(content_source));
                output_dest.close();
                System.out.println("File successfully created and data is stored there.");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
