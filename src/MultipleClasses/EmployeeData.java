package MultipleClasses;

import java.util.*;
public class EmployeeData {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];

        Employee emp1 = new Employee();
        System.out.println("Enter the Employee name, number and salary : ");
        emp1.setEmpName(sc.nextLine());
        emp1.setEmpNo(sc.nextInt());
        emp1.setEmpSal(sc.nextInt());

        Employee emp2 = new Employee();
        System.out.println("Enter the Employee name, number and salary : ");
        emp2.setEmpName(sc.nextLine());
        emp2.setEmpNo(sc.nextInt());
        emp2.setEmpSal(sc.nextInt());

        Employee emp3 = new Employee();
        System.out.println("Enter the Employee name, number and salary : ");
        emp3.setEmpName(sc.nextLine());
        emp3.setEmpNo(sc.nextInt());
        emp3.setEmpSal(sc.nextInt());

        Employee emp4 = new Employee();
        System.out.println("Enter the Employee name, number and salary : ");
        emp4.setEmpName(sc.nextLine());
        emp4.setEmpNo(sc.nextInt());
        emp4.setEmpSal(sc.nextInt());

        Employee emp5 = new Employee();
        System.out.println("Enter the Employee name, number and salary : ");
        emp5.setEmpName(sc.nextLine());
        emp5.setEmpNo(sc.nextInt());
        emp5.setEmpSal(sc.nextInt());

        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;
        emp[3] = emp4;
        emp[4] = emp5;

        for(Employee e : emp){
            System.out.println(e.toString());
        }

    }

    public static class Employee {
        private int empNo;
        private String empName;
        private int empSal;

        public int getEmpNo() {
            return empNo;
        }

        public void setEmpNo(int empNo) {
            this.empNo = empNo;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public int getEmpSal() {
            return empSal;
        }

        public void setEmpSal(int empSal) {
            this.empSal = empSal;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empNo=" + empNo +
                    ", empName='" + empName + '\'' +
                    ", empSal=" + empSal +
                    '}';
        }
    }
}
