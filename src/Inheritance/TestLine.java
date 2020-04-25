package Inheritance;
import java.util.*;

class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Line {
    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}


public class TestLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the point 1 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p1 = new Point();
        p1.setX(x);
        p1.setY(y);

        System.out.print("Enter the point 2 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p2 = new Point();
        p2.setX(x);
        p2.setY(y);

        Line line = new Line();
        line.setPoint1(p1);
        line.setPoint2(p2);

        System.out.println("Point 1 : " + line.getPoint1().getX() + " " + line.getPoint1().getY());
        System.out.println("Point 2 : " + line.getPoint2().getX() + " " + line.getPoint2().getY());
    }
}
