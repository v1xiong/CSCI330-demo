import acm.program.CommandLineProgram;

public class BucketTester extends CommandLineProgram {
    public void run() {
        NumberBucket myBucket = new NumberBucket();
        myBucket.addNumber(3);
        myBucket.addNumber(4);
        System.out.println(myBucket.average());
    }
}
