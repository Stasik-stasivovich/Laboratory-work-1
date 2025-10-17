import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Task2 extends GraphicsProgram {
    private final int HEIGHT = 600;
    private final int WIDTH = 600;
    private final int RADIUS = 50;
    private final int NUMBER_OF_CIRCLE = 11;
    public void run(){
        setSize(WIDTH, HEIGHT);
        int x = getWidth()/2;
        int y = getHeight()/2;
        Color color;
        for (int i=NUMBER_OF_CIRCLE+1;i>=1;i--){
            if (i%2==1) color = Color.RED;
            else color = Color.BLACK;
            createCircle(x,y,RADIUS*i,color);
        }
    }
    public static void main(String[] args) {
        new  Task2().start(args);

    }
    private void createCircle(int x, int y, int radius, Color color){
        GOval g = new GOval(x-radius/2, y-radius/2, radius, radius);
        g.setColor(color);
        g.setFilled(true);
        add(g);
    }

}
