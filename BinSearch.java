public class BinSearch
{

  /**
     int binSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target Comparable
     pre:  input array is sorted in ascending order
     post: returns index of target, or returns -1 if target not found
  **/
  public static int binSearch ( Comparable[] a, Comparable target ) {
    //uncomment exactly 1 of the 2 stmts below:

    return binSearchIter( a, target, 0, a.length-1 );
    //return binSearchRec( a, target, 0, a.length-1 );
  }


  public static int binSearchRec( Comparable[] a, Comparable target,
                                  int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1

    int m = (lo + hi) / 2; //init mid pos var

    //exit case. If lo & hi have crossed, target not present
    if (lo > hi)
      return tPos; //-1

    // target found
    if ( a[m].compareTo(target) == 0 )
      tPos = m;
    // value at mid index higher than target
    else if ( a[m].compareTo(target) > 0 )
      tPos = binSearchRec( a, target, 0, m-1 );
    // value at mid index lower than target
    else if ( a[m].compareTo(target) < 0 )
      tPos = binSearchRec( a, target, m+1, hi );

    return tPos;
  }//end binSearchRec


  public static int binSearchIter( Comparable[] a, Comparable target,
                                   int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    while( lo <= hi ) { // run until lo & hi cross

      m = (lo + hi) / 2; //update mid pos var

      // target found
      if ( a[m].compareTo(target) == 0 )
        return m;

      // value at mid index higher than target
      else if ( a[m].compareTo(target) > 0 )
        hi = m - 1; //move hi to index to left of mid

      // value at mid index lower than target
      else if ( a[m].compareTo(target) < 0 )
        lo = m + 1; //move lo to index to right of mid
    }
    return tPos;
  }//end binSearchIter



  //tell whether an array is sorted in ascending order
  private static boolean isSorted( Comparable[] arr )
  {
    boolean retBoo = true; //init to true, assume array is sorted

    //Q: Why would a FOREACH loop not suffice here?
    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i].compareTo(arr[i+1]) > 0 ) ) {
        return false;
      }
    }
    return retBoo; //if entire array was traversed, it must be sorted
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void printArray( Comparable[] arr ) {
    String output = "[ ";

    for( Comparable c : arr )
      output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }
}
