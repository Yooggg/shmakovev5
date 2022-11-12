package number1;

public class Circle implements Area{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return radius * radius * (float)Math.PI;
    }
}
