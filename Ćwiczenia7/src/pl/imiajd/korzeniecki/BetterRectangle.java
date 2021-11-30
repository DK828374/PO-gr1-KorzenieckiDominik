package pl.imiajd.korzeniecki;
import java.awt.Rectangle;
public class BetterRectangle extends java.awt.Rectangle {
    public BetterRectangle(int x, int y, int height, int width){
        super(x, y, width, height);
    }
    public int getPerimeter(){
        return 2*width+2*height;

    }
    public int getArea(){
        return width*height;
    }

}
