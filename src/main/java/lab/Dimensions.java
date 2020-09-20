package lab;

import java.awt.*;

public class Dimensions {
    private int width;
    private int height;
    private int depth;

    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    public Dimensions(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
