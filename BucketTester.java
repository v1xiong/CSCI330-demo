import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class BucketTester extends GraphicsProgram {
    private GLabel averageLabel;
    private GLabel bucketCountLabel;

    public void init() {
        averageLabel = new GLabel("The average is: ?");
        bucketCountLabel = new GLabel("There are 0 numbers in the bucket");

        this.add(averageLabel, 100, 100);
        this.add(bucketCountLabel, 100, 200);
    }


    public void run() {
        NumberBucket myBucket = new NumberBucket();
        myBucket.addNumber(3);
        myBucket.addNumber(4);
        averageLabel.setLabel("The average is: " + myBucket.average());
        bucketCountLabel.setLabel("There are 2 numbers in the bucket");
    }
}
