package Basic;

import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double average = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        average = sum / n;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        System.out.print("Numbers smaller than average : ");
        for(int i = 0; i < n; i++){
            if(average > arr[i])
                System.out.print(arr[i] + " ");
        }
    }
}
