package Greedy;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0; int max = 0;
        int i=0, j=0;
        while (i < n) {
            if (arr[i] <= dep[j]) {
                count++;
                max = Math.max(count, max);
                i++;
            } else if (dep[j] <= arr[i]) {
                count--;
                j++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findPlatform(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000}, 6));
    }
}
