import java.util.ArrayList;

public class NumberBucket {
    private ArrayList<Integer> bucket;

    public NumberBucket() {
        bucket = new ArrayList<Integer>();
    }

    public void addNumber(int toAdd) {
        bucket.add(toAdd);
    }

    public double average() {
        double sum = 0.0;
        for (Integer x : bucket) {
            sum += x;
        }
        return sum / bucket.size();
    }
}
