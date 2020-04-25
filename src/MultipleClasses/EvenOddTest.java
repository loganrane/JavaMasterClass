package MultipleClasses;

import java.util.*;
public class EvenOddTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        obj.setNum(n);
        obj.checkEvenOdd();
        if (obj.getevenOdd()) {
            System.out.println("The number " + obj.getNum() + " is Even.");
        } else {
            System.out.println("The number " + obj.getNum() + " is Odd.");
        }
    }

    public static class EvenOdd {
        private int num;
        private boolean evenOdd;
        public void setNum(int num){
            this.num = num;
        }
        public int getNum(){
            return num;
        }
        public boolean getevenOdd(){
            return evenOdd;
        }

        public void checkEvenOdd(){
            if(num % 2 == 0)
                evenOdd = true;
            else
                evenOdd = false;
        }
    }
}
