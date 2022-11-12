package number1;

public class Square implements Area{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public float calculateArea() {
        return side * side;
    }
}
