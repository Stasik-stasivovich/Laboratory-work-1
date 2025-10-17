import acm.program.ConsoleProgram;

public class Task6 extends ConsoleProgram {
    public void run(){
        int startNumber = readInt("Enter start number: ");
        println("Number of steps: "+doCycle(startNumber));
    }

    private int doCycle(int startNumber) {
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
