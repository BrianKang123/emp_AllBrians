import java.util.ArrayList;

public class SearchDriver {
    public static void main(String[] args) {
        // initialize and fill ArrayList of len 10000 from 0 - 9999
        ArrayList<Integer> arr10000 = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            arr10000.add(i);
        }

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            // perform binsearch
            long stop = System.currentTimeMillis();
            long diff = stop - start;
            System.out.println("start: " + start);
            System.out.println("stop:  " + stop);
            System.out.println("time elapsed: " + diff);
        }

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            // perform linsearch
            long stop = System.currentTimeMillis();
            long diff = stop - start;
            System.out.println("start: " + start);
            System.out.println("stop:  " + stop);
            System.out.println("time elapsed: " + diff);
        }
    }
}
