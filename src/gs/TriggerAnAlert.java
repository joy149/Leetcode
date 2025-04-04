package gs;
/*
* A compliance system monitors incoming and outbound calls and sends an alert whenever the average calls over a trailing number of
* minutes exceeds a threshold. If trailing minutes to consider, precedingMinutes = 5, at time T, average the call volumes for
*  times T-(5-1), T-(5-2) ...T.

For example, the calls over the last n = 8 minutes are represented in the array numCalls = [2, 2, 2, 2, 5, 5, 5, 8].
* The threshold, alertThreshold = 4 and the trailing values to consider, precedingMinutes = 3.
* No alerts will be sent until at least T = 3 because there are not enough values to consider. At T = 3,
* average calls = (2 + 2 + 2)/3 = 2. Average calls over the windows from T = 3 to the end at T = 8 are 2, 2, 3, 4, 5, and 6.
* A total of 2 alerts are sent during the last two periods. Given data as described, determine the number of alerts sent by the end
* of the timeframe.

* */
public class TriggerAnAlert {

    public static int numberOfAlerts (int precedingMinutes, int alertThreshold, int[] numCalls) {
        int i = 0, j = precedingMinutes - 1;
        int numOfAlerts = 0;

        while (j < numCalls.length) {
            int temp = i;
            int sum = 0;
            while (temp <= j) {
                sum += numCalls[temp++];
            }
            int avgCalls = sum / precedingMinutes;
            if (avgCalls > alertThreshold) {
                numOfAlerts++;
            }
            i++;
            j++;
        }
        return numOfAlerts;
    }

    public static void main(String[] args) {
        int [] calls = new int[] {2, 2, 2, 2, 5, 5, 5, 8};
        int precedingMinutes = 3;
        int alertThreshold = 4;
        System.out.println(numberOfAlerts(precedingMinutes, alertThreshold, calls));
    }
}
