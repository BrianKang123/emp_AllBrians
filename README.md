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
*based on 1000 trials of each type of search on each length of array and multiple sets of 1000 tests were ran to ensure no outliers, but only one set of data was taken*

### Binary Search
| Array Size  | Average Time (ms) | Minimum Time (ms) | Index of Minimum Time | Maximum Time (ms) | Index of Maximum Time |
| ----------  | ----------------- | ----------------- | --------------------- | ----------------- | --------------------- |
| 1           | 0.002             | 0                 | 0                     | 1                 | 0                     |
| 10          | 0.003             | 0                 | 9                     | 1                 | 8                     |
| 100         | 0.003             | 0                 | 18                    | 1                 | 58                    |
| 1,000       | 0.004             | 0                 | 513                   | 1                 | 585                   |
| 10,000      | 0.004             | 0                 | 8,827                 | 1                 | 7,823                 |
| 100,000     | 0.005             | 0                 | 92,692                | 1                 | 72,271                |
| 1,000,000   | 0.004             | 0                 | 915,779               | 1                 | 399,369               |
| 10,000,000  | 0.005             | 0                 | 7,939,015             | 1                 | 3,198,908             |
| 100,000,000 | 0.018             | 0                 | 68,825,515            | 2                 | 89,677,507            |

### Linear Search

| Array Size  | Average Time (ms) | Minimum Time (ms) | Index of Minimum Time | Maximum Time (ms) | Index of Maximum Time |
| ----------  | ----------------- | ----------------- | --------------------- | ----------------- | --------------------- |
| 1           | 0.001             | 0                 | 0                     | 1                 | 0                     |
| 10          | 0.001             | 0                 | 2                     | 1                 | 6                     |
| 100         | 0.002             | 0                 | 79                    | 1                 | 81                    |
| 1,000       | 0.007             | 0                 | 105                   | 1                 | 856                   |
| 10,000      | 0.016             | 0                 | 3,724                 | 1                 | 7,100                 |
| 100,000     | 0.054             | 0                 | 48,960                | 5                 | 69,624                |
| 1,000,000   | 0.328             | 0                 | 262,183               | 13                | 727,067               |
| 10,000,000  | 4.667             | 0                 | 214,626               | 16                | 6,203,263             |
| 100,000,000 | 48.767            | 0                 | 268,711               | 517               | 95,759,983            |

### Binary Search VS Linear Search

| Array Size  | Average Binary Search (ms) | Average Linear Search Time (ms) |
| ----------  | -------------------------- | ------------------------------- |
| 1           | 0.002                      | 0.001                           |
| 10          | 0.003                      | 0.001                           |
| 100         | 0.003                      | 0.002                           |
| 1,000       | 0.004                      | 0.007                           |
| 10,000      | 0.004                      | 0.016                           |
| 100,000     | 0.005                      | 0.054                           |
| 1,000,000   | 0.004                      | 0.328                           |
| 10,000,000  | 0.005                      | 4.667                           |
| 100,000,000 | 0.018                      | 48.767                          |

# Conclusions
Binary search seems to be the faster of the two search algorithms for larger arrays, the turning point being somewhere in between 100 and 1000 elements (lack of precision makes an exact value hard to determine). However, for binary search to work, the array that we want to search in must already be sorted.

Our results also show that linear search's best case scenario is when the target is at the start of the array and the worst case scenario is when the target is at the end of the array since the max time index is always greater than the min time index.

The time of linear search also increases proportionally as the array size gets bigger. For example, by increasing the array size from 10 million to 100 million, the average linear search time also increases by around 10 times.
