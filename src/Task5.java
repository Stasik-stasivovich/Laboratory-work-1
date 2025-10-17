import acm.program.ConsoleProgram;

public class Task5 extends ConsoleProgram {
    private static final int STOP_NUMBER=5;
    public void run() {
        while (readInt("Continue - 1")==1) {
            int ans = 0;
            int a = readInt("Enter number: ");
            while (a != STOP_NUMBER) {
                ans += a;
                a = readInt("Enter number: ");
            }
            println("Answer: " + ans);
        }
    }
    public static void main(String[] args){
        new Task5().start(args);
    }
}
