import acm.program.CommandLineProgram;

public class BucketTester extends CommandLineProgram {
    public void run() {
        NumberBucket myBucket = new NumberBucket();

        int userEntry;
        while (true) {
            userEntry = this.readInt("Enter an int (-1 to stop)");
            if (userEntry == -1)
                break;
            myBucket.addNumber(userEntry);
        }
        System.out.println("The average is: " + myBucket.average());
    }
}
