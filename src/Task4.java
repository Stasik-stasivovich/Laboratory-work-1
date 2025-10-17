import acm.program.ConsoleProgram;

/*
Author Stanislav Koshynskyi
File Task1
Task Написати програму, що запитує у користувача два числа і обраховує корень квадратний з суми їх квадратів.

Теорема піфагора




 */
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
