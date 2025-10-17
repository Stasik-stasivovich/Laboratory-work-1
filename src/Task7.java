import acm.program.ConsoleProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Обов'язково використовувати рекурсію та рекурентність
Послідовність сум {sn}, де sn=1+x+x2/2!+…+xn/n!, за умови 0<=x<1 "достатньо швидко" сходиться до ex. Запрограмувати обчислення ex при x [0;1) із точністю ep , тобто за потрібне число приймається перше snтаке, що | sn-sn-1 |<ep .

Розв'язати двома способами: з використанням циклів (але використовуючи рекурентність) та з використанням рекурсивних викликів методів.
 */
public class Task7 extends ConsoleProgram {
    private static final double ACCURACY = 0.000001;
    public void run() {
        println("Calculation of approximate value of e**x");
        double x = readDouble("X: ");
        while (x<0 || x>=1)x = readDouble("Between 0 and 1");
        println("Recurs ="+calculateRecursCall(x));
        println("Recurrent ="+calculatRecurent(x));
        println("More optimal ="+calculatOptimal(x));
        println("E^x = "+Math.exp(x));
    }

    private double calculatOptimal(double x) {// оптимальне рішення (+-)
        double numberNow = 1;
        int counter = 1;
        double sum=1;
        while (numberNow>=ACCURACY){
            numberNow= numberNow*(x/(counter));
            counter++;
            sum+=numberNow;
        }
        return sum;

    }

    private double calculatRecurent(double x) {// рекурентне рішення
        double numberNow=1;
        int counter =1;
        double sum=1;
        while (numberNow>=ACCURACY){
            numberNow = Math.pow(x,counter)/facrorialRecurent(counter);
            sum+=numberNow;
            counter++;
        }
        return sum;
    }

    private double facrorialRecurent(int number) {//обчислення факторіала рекурентно
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private double calculateRecursCall(double x) {//метод що викликає рекурентне обчислення
        return calculateRecurs(x,0,0);
    }
    private double calculateRecurs(double x,int number, double sum) {// рекурсивне обчислення

        double elementNow= Math.pow(x,number)/factorialRecurs(number);
        sum+=elementNow;
        if (elementNow<ACCURACY) return sum;
        return calculateRecurs(x,number+1,sum);
    }
    private int factorialRecurs(int a){//рекурсивний факторіал
        if (a==0) return 1;
        return a*factorialRecurs(a-1);
    }
    public static void main(String[] args) {
        new Task7().start(args);
    }
}
