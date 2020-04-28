package AdvancedOOP;

public class Bathroom {
    public static void main(String[] args){
        Tub myTub = new Tub(12);
        System.out.println(myTub.getSize());
        System.out.println(myTub.getBubbleColor());
    }
}

class Tub {
    private int size;
    // Bubble instance here.
    private Bubble b;

    public Tub(int size) {
        this.size = size;
        b = new Bubble();
        b.setColor("Blue");
        b.setRadius(23);
    }

    public String getBubbleColor(){
        return b.getColor();
    }

    public int getBubbleSize() {
        return b.getRadius();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bubble getB() {
        return b;
    }

    public void setB(Bubble b) {
        this.b = b;
    }
}

class Bubble {
    private int radius;
    private String color;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
