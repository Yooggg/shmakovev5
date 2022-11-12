package number2;

public class Square implements Area {
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    @Override
    public float calculateArea() {
        return side * side;
    }
}
