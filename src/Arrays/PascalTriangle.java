package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle {
    //Easy way to calculate nth element in Rth row and Cth column in pascal triangle is r-1Cc-1.
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if (numRows == 1) {
            return result;
        }
        result.add(Arrays.asList(1,1));
        if (numRows == 2) {
            return  result;
        }

        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i-1) {
                    row.add(1);
                }
                else {
                    row.add((result.get(result.size()-1).get(j-1) + result.get(result.size()-1).get(j)));
                }
            }
            result.add(row);
        }
        return result;
    }

    //More optimized way of calculating nCr
    private long calculateNCR(int n, int r) {
        long result = 1;
        for (int i = 0 ; i < r; i++) {
            result = result * (n - i);
            result = result/(i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle pT = new PascalTriangle();
        System.out.println(pT.generate(5));
        System.out.println(pT.calculateNCR(4,1));
    }
}
