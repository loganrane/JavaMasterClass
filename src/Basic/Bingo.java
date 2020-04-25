package Basic;

import java.util.*;
public class Bingo {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,45};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        while(n<1||n>50){
            System.out.println("Invalid number.");
            System.out.print("Enter again : ");
            n = sc.nextInt();
        }
        for(int i = 0;i < 5; i++){
            if(n==arr[i]){
                System.out.println("BINGO!!");
            }
        }
    }
}
