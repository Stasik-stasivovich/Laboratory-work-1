import acm.program.ConsoleProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Написати програму, що зчитує з клавіатури цілі числа (по одному числу за раз), поки користувач не введе число 0 (ви маєте бути в змозі легко поміняти цю умову на якесь інше число). По закінченню вводу ваша програма має вивести найменше і найбільше число.



Якщо користувач введе лише одне число, програма має повідомити що це число і найбільше і найменше
Якщо користувач в першій же стрічці введе символ закінчення вводу, тоді вважається, що жодного числа не було введено і програма має це повідомити.
 */
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
