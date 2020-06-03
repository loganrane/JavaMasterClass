package ExceptionHandling;

import java.util.Scanner;

class ArrayNumber{
    Scanner sc = new Scanner(System.in);
    private int num[] = new int[7];
    public void setElements() throws ArrayIndexOutOfBoundsException{
        System.out.println("Enter index and array : ");
        for(int i=0; i<5; i++){
            int index = sc.nextInt();
            if(index >= 5) throw new ArrayIndexOutOfBoundsException();
            num[index] = sc.nextInt();
        }
    }

    public void printElements(){
        for(int i=0; i<5; i++){
            System.out.println("Element : " + (i+1) + num[i]);
        }
    }

    public void calculateSum(){
        num[5] = 0;
        num[6] = 5;
        for(int i=0; i<5; i++) num[5] += num[i];
    }

    public int computeAverage(int totalSum, int totalCount) throws ArithmeticException{
        return totalSum / totalCount;
    }

    public void printAverage(int totalSum, int totalCount){
        try{
            System.out.println(computeAverage(totalSum, totalCount));
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public int getSum(){
        return num[5];
    }

    public int getTotalNumber(){
        return num[6];
    }
}

public class TestArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayNumber arr = new ArrayNumber();
        arr.setElements();
        arr.printElements();
        int total = arr.getSum();
        int count = arr.getTotalNumber();
        arr.printAverage(total, count);
    }
}
