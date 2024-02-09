package Greedy;

import java.util.*;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
public class NMeetingsInOneRoom {
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    //N = 6
    //start[] = {1,3,0,5,8,5}
    //end[] =  {2,4,6,7,9,9}
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            meetings.add(new Meeting(start[i], end[i], i+1));
        }
        meetings.sort(new MeetingComparator());
        int res = 1;
        int limit = meetings.get(0).end;
        for (int i = 1; i < start.length; i++) {
            if (meetings.get(i).start > limit) {
                res++;
                limit = meetings.get(i).end;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxMeetings(new int[] {1,3,0,5,8,5}, new int[] {2,4,6,7,9,9}, 6));
    }
}
class Meeting {
    int start,end,pos;
    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class MeetingComparator implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if (o1.end > o2.end) return 1;
        else if (o1.end < o2.end) return -1;
        else if (o1.pos > o2.pos) return 1;
        return -1;
    }
}
