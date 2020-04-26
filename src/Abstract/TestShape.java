package Abstract;

interface Shape {
    void draw();
    void rotate();
}

class Circle implements Shape {
    public void draw(){
        System.out.println("Circle Drawn.");
    }
    public void rotate(){
        System.out.println("Circle Rotated.");
    }
}

class Rectangle implements Shape {
    public void draw(){
        System.out.println("Rectangle Drawn.");
    }
    public void rotate(){
        System.out.println("Rectangle Rotated.");
    }
}


public class TestShape {
    public static void main(String[] args){
        Shape cir = new Circle();
        Shape rec = new Rectangle();
        cir.draw();
        cir.rotate();
        rec.draw();
        rec.rotate();
    }
}
