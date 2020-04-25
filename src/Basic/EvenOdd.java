package Basic;

import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
