package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/description/
public class MergeIntervals {
    //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //Output: [[1,6],[8,10],[15,18]]
    //Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0])
                    return 1;
                return -1;
            }
        });
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (!ans.isEmpty() && intervals[i][0] > intervals[i-1][1]) {
                continue;
            }
            else if (intervals[i+1][1] > intervals[i][1]) {
                List<Integer> list = new ArrayList<>();
                list.add(intervals[i][0]);
                list.add(intervals[i+1][1]);
                ans.add(list);
            }
        }
        int [][] arr = new int [ans.size()][2];
        for (int i = 0; i <ans.size(); i++) {
            arr[i][0] = ans.get(i).get(0);
            arr[i][1] = ans.get(i).get(1);
        }
        return arr;
    }
}
