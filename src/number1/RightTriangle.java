package number1;

public class RightTriangle implements Area{
    private int cathet1;
    private int cathet2;

    public RightTriangle(int cathet1,int cathet2){
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public int getCathet1() {
        return cathet1;
    }

    public void setCathet1(int cathet1) {
        this.cathet1 = cathet1;
    }

    public int getCathet2() {
        return cathet2;
    }

    public void setCathet2(int cathet2) {
        this.cathet2 = cathet2;
    }

    @Override
    public float calculateArea() {
        return 0.5f * cathet1 * cathet2;
    }
}
