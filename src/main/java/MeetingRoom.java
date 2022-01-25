import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRoom {
    public static void main(String[] args) {
        int[][] array = {{0,30},{5,10},{15,20}};
        //int[][] array = {{13,15},{1,13}};
        System.out.println(minMeetingRooms(array));
    }
        public static class Interval implements Comparable<Interval> {
            int start;
            int end;
            int duration;
            public Interval(int[] a) {
                this.start = a[0];
                this.end = a[1];
                this.duration = a[1]-a[0];
            }

            @Override
            public int compareTo(Interval a) {
                return Integer.compare(this.start, a.start);
            }
        }
    public static int  minMeetingRooms(int[][] intervals) {
        int roomsNum = 1;
        List<Interval> intervalList = new ArrayList<>();

        for(int i = 0; i< intervals.length; i++) {
            intervalList.add(new Interval(intervals[i]));
        }
        Collections.sort(intervalList);
        for(int i =0 ; i< intervalList.size()-1; i ++) {
            if(intervalList.get(i).end > intervalList.get(i+1).start) {
                roomsNum ++;
            }
        }
        return roomsNum;
    }
    }