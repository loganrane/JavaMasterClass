package Abstract;

abstract class Arithmetic {
    public abstract int subtraction(int first, int second);
    public abstract int subtraction(int first, int second, int third);
    public abstract double subtraction(int first, double second);
    public abstract float subtraction(float first, float second, float third);
}

class ArithmeticImpl extends Arithmetic {

    @Override
    public int subtraction(int first, int second){
        return first - second;
    }

    @Override
    public int subtraction(int first, int second, int third){
        return first - (second + third);
    }

    @Override
    public double subtraction(int first, double second){
        return first - second;
    }

    @Override
    public float subtraction(float first, float second, float third) {
        return first - (second + third);
    }

}



public class ArithmeticDemo {
    public static void main(String[] args){
        ArithmeticImpl alpha = new ArithmeticImpl();
        int f = 12;
        int s = 2;
        int t = 5;
        float a = 12.33f;
        float b = 2.11f;
        float c = 3.111f;
        double x = 9.9;
        System.out.println("2 integers : " + alpha.subtraction(f, s));
        System.out.println("3 integers : " + alpha.subtraction(f, s, t));
        System.out.println("1 double : " + alpha.subtraction(f, x));
        System.out.println("3 float : " + alpha.subtraction(a, b, c));
    }
}
