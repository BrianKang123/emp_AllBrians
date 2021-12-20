# emp_AllBrians
TNPG: All_Brians\
Roster: Brian Kang, Brian Wang, Ryan Lau

# Tests Performed
0. Create an array of 100,000,000 (or the argument passed through `String[] args`) integers with each element being its index.
1. Run 1000 trials of binary search with each trial taking a new randomly generated target to search for.

    a. For each trial, record the time it takes for the search.
2. Print out the times and indexes of the slowest and fastest searches along with average and total time of the 1000 trials
3. Repeat steps 1 and 2 with linear search.

# Results
(All tests repeated 1000 times)
Average time per search by length:  
1. Bin - 0.002 ms
   Lin - 0.001 ms
10. Bin - 0.003 ms
    Lin - 0.001 ms
100. Bin - 0.003 ms
     Lin - 0.002 ms
1000. Bin - 0.004 ms
      Lin - 0.007 ms
10000. Bin - 0.004 ms
       Lin - 0.016 ms
100000. Bin - 0.005 ms
        Lin - 0.054 ms
1000000. Bin - 0.004 ms
         Lin - 0.691 ms
10000000. Bin - 0.005 ms
          Lin - 11.104 ms
100000000. Bin - 0.007 ms
           Lin - 114.598 ms  
(Multiple sets of 1000 tests were ran to ensure no outliers, but only one set of data was taken)
# Conclusions
Binary search seems to be the faster of the two search algorithms for larger arrays, the turning point being somewhere in between 100 and 1000 elements (lack of precision makes an exact value hard to determine). However, for binary search to work, the array that we want to search in must already be sorted.
