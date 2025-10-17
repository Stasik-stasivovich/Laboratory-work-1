import acm.program.ConsoleProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Обов'язково використовувати рекурсію та рекурентність
Послідовність сум {sn}, де sn=1-x2/2!+…+(-1)nx2n/(2n)!, за умови |x|<= p /4 "достатньо швидко" сходиться до cos(x). Запрограмувати обчислення cos(x) при x [-p /4; p/4] з точністю ep , тобто за потрібне число приймається перше snтаке, що | sn-sn-1 |<ep .

Розв'язати двома способами: з використанням циклів (але використовуючи рекурентність) та з використанням рекурсивних викликів методів.
 */
public class Task8 extends ConsoleProgram {
    private final double ACCURACY=0.0001;
    public void run() {
        println("Calculation of approximate value of cos(x)");
        double x = readDouble("Please enter a number: ");
        while (x<-Math.PI/4||x>Math.PI/4)x = readDouble("Number must be between -pi/4 and pi/4");
        println("Recurs "+recursCosCall(x));
        println("Recurrent "+recurentCos(x));
        println("Smart "+optimalCos(x));
    }
    private double optimalCos(double x) {// оптимальний розв'язок (+-)
        double sum = 1;
        double elementNow = 1;
        int counter = 0;
        while (Math.abs(elementNow)>ACCURACY) {
            elementNow = -1*elementNow*x*x/((counter+1)*(counter+2));
            sum = sum + elementNow;
            counter+=2;
        }
        return sum;

    }

    private double recurentCos(double x){ // рекурентний
        double elementNow = 1;
        double sum = 1;
        int counter = 2;
        while (Math.abs(elementNow)>ACCURACY) {
            elementNow = Math.pow(x, counter)*Math.pow(-1, counter/2)/recurentFactorial(counter);
            sum += elementNow;
            counter+=2;
        }
        return sum;
    }

    private int recurentFactorial(int counter) { // обчислення факторіала рекурентно
        int factorial = 1;
        for (int i = 1; i <= counter; i++) factorial *= i;
        return factorial;
    }

    private double recursCosCall(double x) { // допоміжний метод що викликає рекурсію
        return recursCos(x,2,1);
    }

    private double recursCos(double x, int counter, double sum) { // обчислення рекурсією
        double elementNow = Math.pow(x, counter)*Math.pow(-1, counter/2)/recursFactorial(counter);
        sum += elementNow;
        counter+=2;
        if (Math.abs(elementNow)<ACCURACY) return sum;
        else return recursCos(x,counter,sum);
    }

    private double recursFactorial(int num) {// обчислення факторіала рекурсією
        if  (num==0)
            return 1;
        else
            return num*recursFactorial(num-1);
    }

    public static void main (String[] args) {
        new  Task8().start(args);
    }
}
