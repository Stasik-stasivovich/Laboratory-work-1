import acm.program.ConsoleProgram;

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
    private double optimalCos(double x) {
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

    private double recurentCos(double x) {
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

    private int recurentFactorial(int counter) {
        int factorial = 1;
        for (int i = 1; i <= counter; i++) factorial *= i;
        return factorial;
    }

    private double recursCosCall(double x) {
        return recursCos(x,2,1);
    }

    private double recursCos(double x, int counter, double sum) {
        double elementNow = Math.pow(x, counter)*Math.pow(-1, counter/2)/recursFactorial(counter);
        sum += elementNow;
        counter+=2;
        if (Math.abs(elementNow)<ACCURACY) return sum;
        else return recursCos(x,counter,sum);
    }

    private double recursFactorial(int num) {
        if  (num==0)
            return 1;
        else
            return num*recursFactorial(num-1);
    }

    public static void main (String[] args) {
        new  Task8().start(args);
    }
}
