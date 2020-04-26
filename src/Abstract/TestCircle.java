package Abstract;

interface GeometryConstant {
    double PI = 3.142;
}

interface GeometryMethod {
    double calArea (double radius);
    double calCircumference(double radius);
}

class CircleImpl implements GeometryConstant, GeometryMethod {
    public double calArea(double radius){
        return PI * radius * radius;
    }
    public double calCircumference(double radius){
        return 2 * PI * radius;
    }
}

public class TestCircle {
    public static void main(String[] args){
        CircleImpl c = new CircleImpl();
        System.out.println(c.calArea(5));
        System.out.println(c.calCircumference(6));
    }
}
