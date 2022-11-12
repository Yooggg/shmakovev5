package number2;

public class Circle implements Area {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    @Override
    public float calculateArea() {
        return radius * radius * (float)Math.PI;
    }
}
