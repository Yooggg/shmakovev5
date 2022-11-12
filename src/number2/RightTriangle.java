package number2;

public class RightTriangle implements Area {
    private int cathet1;
    private int cathet2;

    public RightTriangle(int cathet1,int cathet2){
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    @Override
    public float calculateArea() {
        return 0.5f * cathet1 * cathet2;
    }
}
