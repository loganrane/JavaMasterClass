package MultipleClasses;

import java.util.*;
public class TestRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and width : ");
        Rectangle rec = new Rectangle();
        rec.setHeight(sc.nextInt());
        rec.setWidth(sc.nextInt());
        System.out.println("The area of rectangle : " + rec.calArea());
    }
}

class Rectangle{
    private double height;
    private double width;

    Rectangle(){
        height = 5.0;
        width = 5.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calArea(){
        return height * width;
    }
}
