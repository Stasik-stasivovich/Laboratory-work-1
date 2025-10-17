import acm.program.ConsoleProgram;
/*
Author Stanislav Koshynskyi
File Task1
Task Опис алгоритму:

візьміть позитивне ціле число, назвемо його n
якщо n парне, поділимо його на 2
якщо n не парне, помножимой його на 3 і додамо 1
продовжувати цей процес поки n не буде дорівнювати 1
Напишіть програму, що реалізує вказаний алгоритм і наочно проілюструє його виконання. В кінці обов'язково повідомити кількість кроків.
 */
public class Task6 extends ConsoleProgram {
    public void run(){
        while (readInt("Continue -1")==1) {
            int startNumber = readInt("Enter start number: ");
            while (startNumber < 1) startNumber = readInt("must be >=1");
            println("Number of steps: " + doCycle(startNumber));
        }
    }

    private int doCycle(int startNumber) {// do cycle
        int temp;
        int counter=0;
        while (startNumber!=1){
            if (startNumber%2==1){
                temp = startNumber*3+1;
                println(startNumber+" * 3 + 1 = "+temp);
            }
            else{
                temp = startNumber/2;
                println(startNumber+" / 2 = "+temp);
            }
            counter++;
            startNumber=temp;

        }
        return (counter);
    }

    public static void main(String[] args){
        new Task6().start(args);
    }
}
