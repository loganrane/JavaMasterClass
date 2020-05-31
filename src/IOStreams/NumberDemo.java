package IOStreams;

import java.io.*;
import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Taking the user input.
        System.out.println("Enter the numbers : ");
        String[] input = new String[10];
        for(int i=0; i<10; i++) input[i] = sc.nextLine();

        // Stating the file path.
        String file_path_destination = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\number.txt";
        File dest_file = new File(file_path_destination);

        // Writing into the file.
        try(FileWriter output_dest = new FileWriter(dest_file)){
            // Recording data line by line in numbers.txt file.
            for(int i=0; i<10; i++){
                output_dest.write(input[i]);
                output_dest.write("\n");
            }
            System.out.println("Data is recorded.");
        } catch (IOException e){
            e.printStackTrace();
        }

        // Declaring variables to store odd and even numbers
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        // Reading the file using BufferedReader to get data line by line.
        try(FileReader fileReader = new FileReader(dest_file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            while((temp = bufferedReader.readLine()) != null){
                if(Integer.parseInt(temp) % 2 != 0){
                    odd.append(temp).append(" ");
                }
                else{
                    even.append(temp).append(" ");
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }

        // Storing the data in odd.txt
        String file_path_odd = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\odd.txt";
        File file_odd = new File(file_path_odd);
        try(FileWriter output_odd = new FileWriter(file_odd)){
            output_odd.write(odd.toString());
            System.out.println("Odd numbers is recorded in odd.txt.");
        } catch (IOException e){
            e.printStackTrace();
        }

        // Storing the data in even.txt
        String file_path_even = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\even.txt";
        File file_even = new File(file_path_even);
        try(FileWriter output_even = new FileWriter(file_odd)){
            output_even.write(odd.toString());
            System.out.println("Even numbers is recorded in odd.txt.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
