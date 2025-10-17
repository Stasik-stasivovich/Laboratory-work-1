import acm.program.ConsoleProgram;


public class Task4 extends ConsoleProgram {
    public void  run() {
        while (readInt("Continue - 1") == 1) {
            println("Pifagore Theorem");
            int a = readInt("First number: ");
            int b = readInt("Second number: ");
            println("Answer: " + Math.sqrt(a * a + b * b));
        }
    }
    public static void main(String[] args){
        new Task4().start(args);
    }
}
