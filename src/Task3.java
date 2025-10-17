import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Написати програму, що малює часткову діаграму класів acm.program, як показано в прикладі:



Діаграма має вписуватись у розміри вікна і розташовуватися по центру вікна.


 */
public class Task3 extends GraphicsProgram {
    private static final int HEIGHT = 800;
    private static final int WIDTH = 800;
    public void run() {
        setSize(WIDTH, HEIGHT);
        int rectWidth = WIDTH/5;
        int rectHeight = HEIGHT/15;
        GRect rectProgram = new GRect(getWidth()/2-rectWidth/2,getHeight()/2-2*rectHeight,rectWidth,rectHeight);
        GLabel labelProgram = new GLabel("Program",getWidth()/2-rectWidth/2,getHeight()/2-1.5*rectHeight);
        labelProgram.setFont("Arial-"+Math.min(getWidth(),getHeight())/30);
        add(labelProgram);
        add(rectProgram);
        GRect rectConsoleProgram = new GRect(getWidth()/2-rectWidth/2,getHeight()/2,rectWidth,rectHeight);
        add(rectConsoleProgram);
        GLabel labelConsoleProgram = new GLabel("Console Program",getWidth()/2-rectWidth/2,getHeight()/2+rectHeight/2);
        labelConsoleProgram.setFont("Arial-"+Math.min(getWidth(),getHeight())/40);
        add(labelConsoleProgram);

        GRect rectGraphicsProgram = new GRect(getWidth()/2-3*rectWidth/2-rectHeight/2,getHeight()/2,rectWidth,rectHeight);
        add(rectGraphicsProgram);
        GLabel labelGraphicsProgram = new GLabel("GraphicsProgram",getWidth()/2-3*rectWidth/2-rectHeight/2,getHeight()/2+rectHeight/2);
        labelGraphicsProgram.setFont("Arial-"+Math.min(getWidth(),getHeight())/40);
        add(labelGraphicsProgram);
        GRect rectDialogProgram = new GRect(getWidth()/2+rectWidth/2+rectHeight/2,getHeight()/2,rectWidth,rectHeight);
        add(rectDialogProgram);
        GLabel labelDialogProgram = new GLabel("DialogProgram",getWidth()/2+rectWidth/2+rectHeight/2,getHeight()/2+rectHeight/2);
        labelDialogProgram.setFont("Arial-"+Math.min(getWidth(),getHeight())/40);
        add(labelDialogProgram);
        GLine line1 = new GLine(getWidth()/2,getHeight()/2-rectHeight,getWidth()/2,getHeight()/2);
        add(line1);
        GLine line2 = new GLine(getWidth()/2,getHeight()/2-rectHeight,getWidth()/2-rectWidth-rectHeight/2,getHeight()/2);
        add(line2);
        GLine line3 = new GLine(getWidth()/2,getHeight()/2-rectHeight,getWidth()/2+rectWidth+rectHeight/2,getHeight()/2);
        add(line3);
    }
    public static void main(String[] args) {
        new Task3().start(args);
    }
}
