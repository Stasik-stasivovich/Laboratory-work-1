import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Напишіть програму що малює піраміду. Піраміда складається з горизонтальних рядів цеглин. В кожному наступному ряду кількість цеглин зменшується на один. Нижче наведено приклад:



Піраміда має розташовуватися по центру горизонталі вікна. Мають бути використані наступні константи (тестувати при різних значеннях констант):

BRICK_WIDTH - 30 пікселів
BRICK_HEIGHT - 12 пікселів
BRICKS_IN_BASE - 14

 */
public class Task1 extends GraphicsProgram {
    private final int BRICK_WIDTH = 20;
    private final int BRICK_HEIGHT = 20;
    private final int BRICK_IN_BASE = 30;
    private final int HEIGHT = 700;
    private final int WIDTH = 700;
    public void run() {
        setSize(WIDTH, HEIGHT);
        createLayer(BRICK_IN_BASE,getHeight()-BRICK_HEIGHT-2);
    }
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.start(args);
    }
    private void createBrick(int x, int y) {//createBrick
        GRect brick = new GRect(x,y,BRICK_WIDTH, BRICK_HEIGHT);
        add(brick);
    }
    private void createLayer(int n, int y){//createLayer
        if (n==0)return;
        int startX = (getWidth()/2)-(n*BRICK_WIDTH/2);
        for (int i = 0; i < n; i++) {
            createBrick(startX+BRICK_WIDTH*i,y);
        }
        createLayer(n-1,y-BRICK_HEIGHT);
    }
}









