import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System .in);
        for(int i=0;i<3;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = a + b;
            System.out.println(c);
        }
    }
}
