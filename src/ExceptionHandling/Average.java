package ExceptionHandling;

import java.util.Scanner;

public class Average {
    public static void printAverage(int totalSum, int totalCount){
        System.out.println(computeAverage(totalSum, totalCount));
    }

    public static int computeAverage(int sum, int number){
        int res = 0;
        try {
            res = sum / number;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exception handled successfully.");
        }
        return res;
    }
}

class TestAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sum and count : ");
        int sum = sc.nextInt();
        int num = sc.nextInt();
        Average  avg = new Average();
        avg.printAverage(sum, num);
    }
}
