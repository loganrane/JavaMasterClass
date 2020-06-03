package IOStreams;

import java.io.*;
import java.util.Scanner;

public class WriteEmployee {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Making a new Employee object
        System.out.print("Enter the name of employee : ");
        String name = sc.nextLine();
        System.out.print("Enter the employee number : ");
        int no = sc.nextInt();
        System.out.print("Enter the employee basic salary : ");
        int sal = sc.nextInt();
        Employee em = new Employee(no, name, sal);


        // Storing the data in the files
        String path_file = "C:\\Users\\lenovo\\Desktop\\GitBlaze\\JavaMasterClass\\src\\emp.txt";
        File emp_file = new File(path_file);
        try(FileWriter writer = new FileWriter(emp_file)){
            // Writing into the file with delimeter ","
            writer.write(Integer.toString(em.getEmpNo()));
            writer.write(",");
            writer.write(em.getEmpName());
            writer.write(",");
            writer.write(Integer.toString(em.getEmpBasic()));

        } catch(IOException e){
            e.printStackTrace();
        }

        // Reading and printing the details.
        try(FileReader fileReader = new FileReader(emp_file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            while((temp = bufferedReader.readLine()) != null){
                String[] emp_details = temp.split(",", 3);
                System.out.println("Emp Number: " + emp_details[0] + " | Emp Name: " + emp_details[1] + " | Emp Salary: " + emp_details[2]);
            }
        }
    }
}
