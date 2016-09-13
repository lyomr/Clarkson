/**
 * Created by Oumar on 9/13/2016.
 */
public class FilledCircle extends Circle {
    private float red;
    private float green;
    private float blue;

    //private float radius; <--- should not do this
    public FilledCircle (float radius, int centerX, int centerY, float red, float green, float blue){
        super(radius, centerX, centerY);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    /*default constructor*/
    public FilledCircle(){
        this(1.0f, 2, 3, 0.0f, 0.0f, 0.0f);
    }

}
