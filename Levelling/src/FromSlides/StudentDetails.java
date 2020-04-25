package FromSlides;

import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[5];
        int roll;
        String name;
        for(int i=0; i<3; i++){
            System.out.print("Enter the roll and name of Student " + i + " : ");
            roll = sc.nextInt();
            name = sc.nextLine();
            arr[i] = new Student(roll, name);
        }

        for(int i=0;i<3;i++){
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no +" "+ arr[i].name);
        }
    }
}

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
