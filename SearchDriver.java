// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// L03 -- Get Empirical
// 2021-12-21

public class SearchDriver {
    public static void main(String[] args) {
        int arrLength = 100_000_000;

        // update arrLength if provided through args
        if (args.length != 0) {
            arrLength = Integer.parseInt(args[0]);
        }

        // initialize and fill array of Comparables from 0 - arrLength - 1
        Comparable[] arr = new Comparable[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // initialize stats
        long minTime, maxTime, totalTime;
        int maxTimeIdx, minTimeIdx;
        maxTime = 0;
        minTime = 999999999;
        totalTime = 0;
        maxTimeIdx = -1;
        minTimeIdx = -1;

        // perform 1000 binary searches
        for (int i = 0; i < 1000; i++) {
            int randInt = (int) (Math.random() * arrLength);
            long start = System.currentTimeMillis();      // record start time
            BinSearch.binSearch(arr, randInt);
            long stop = System.currentTimeMillis();       // record stop time
            long diff = stop - start;                     // calc time elapsed
            totalTime += diff;
            if (diff > maxTime) {
                maxTime = diff;
                maxTimeIdx = randInt;
            }
            if (diff < minTime) {
                minTime = diff;
                minTimeIdx = randInt;
            }
        }
        System.out.println("results from running 1,000 binary searches on an " +
                           "array of length " + arrLength +
                           "\naverage:   " + totalTime / 1000.0 + " ms" +
                           "\nminTime:   " + minTime + " ms\t\tidx:   " + minTimeIdx +
                           "\nmaxTime:   " + maxTime + " ms\t\tidx:   " + maxTimeIdx +
                           "\ntotalTime: " + totalTime + " ms");

        // reset stats
        maxTime = 0;
        minTime = 999999999;
        totalTime = 0;
        maxTimeIdx = -1;
        minTimeIdx = -1;

        // perform 1000 linear searches
        for (int i = 0; i < 1000; i++) {                  // perform 1000 trials
            int randInt = (int) (Math.random() * arrLength);
            long start = System.currentTimeMillis();      // record start time
            LinSearch.linSearch(arr, randInt);
            long stop = System.currentTimeMillis();       // record stop time
            long diff = stop - start;                     // calc time elapsed
            totalTime += diff;
            if (diff > maxTime) {
                maxTime = diff;
                maxTimeIdx = randInt;
            }
            if (diff < minTime) {
                minTime = diff;
                minTimeIdx = randInt;
            }
        }
        System.out.println("results from running 1,000 linear searches on an " +
                           "array of length " + arrLength +
                           "\naverage:   " + totalTime / 1000.0 + " ms" +
                           "\nminTime:   " + minTime + " ms\t\tidx:   " + minTimeIdx +
                           "\nmaxTime:   " + maxTime + " ms\tidx:   " + maxTimeIdx +
                           "\ntotalTime: " + totalTime + " ms");
    }
}
