import acm.program.ConsoleProgram;

public class Task7 extends ConsoleProgram {
    private static final double ACCURACY = 10;
    public void run() {
        println("Calculation of approximate value of e**x");
        double x = readDouble("X: ");
        while (x<0 || x>=1)x = readDouble("Between 0 and 1");
        println("Recurs ="+calculateRecursCall(x));
        println("Recurrent ="+calculatRecurent(x));
        println("More optimal ="+calculatOptimal(x));
    }

    private double calculatOptimal(double x) {
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

    private double calculatRecurent(double x) {
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

    private double facrorialRecurent(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private double calculateRecursCall(double x) {
        return calculateRecurs(x,0,0);
    }
    private double calculateRecurs(double x,int number, double sum) {

        double elementNow= Math.pow(x,number)/factorialRecurs(number);
        sum+=elementNow;
        if (elementNow<ACCURACY) return sum;
        return calculateRecurs(x,number+1,sum);
    }
    private int factorialRecurs(int a){
        if (a==0) return 1;
        return a*factorialRecurs(a-1);
    }
    public static void main(String[] args) {
        new Task7().start(args);
    }
}
