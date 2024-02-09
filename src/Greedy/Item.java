package Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class ItemComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        double effValue1 = (double)o1.value/(double)o1.weight;
        double effValue2 = (double)o2.value/(double)o2.weight;
        if (effValue1 < effValue2) return 1;
        else if (effValue2 < effValue1) return -1;
        else return 0;
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    //N = 3, W = 50
    //value[] = {60,100,120}
    //weight[] = {10,20,30}
    //arr = {6, 5, 4}
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort(arr, new ItemComparator());
        double value = 0.0;
        for (int i = 0; i < n; i++) {
            if (W >= arr[i].weight) {
                value += arr[i].value;
                W = W - arr[i].weight;
            }
            else {
                value += ((double)arr[i].value/(double)arr[i].weight) * W;
                W = 0;
            }
        }
        return value;
    }
}