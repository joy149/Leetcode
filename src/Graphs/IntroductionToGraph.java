package Graphs;

//https://www.geeksforgeeks.org/problems/graph-and-vertices/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=graph-and-vertices
public class IntroductionToGraph {

/*The maximum number of edges a graph with N vertices can contain is X = N * (N – 1) / 2.
The total number of graphs containing 0 edge and N vertices will be XC0
The total number of graphs containing 1 edge and N vertices will be XC1
And so on from a number of edges 1 to X with N vertices
Hence, the total number of graphs that can be formed with n vertices will be:
XC0 + XC1 + XC2 + … + XCX = 2X.
*/


    static long count(int n) {
        // code here
        long x = ((long) n * (n - 1)) / 2;
        return (long) Math.pow(2, x);

    }

}
