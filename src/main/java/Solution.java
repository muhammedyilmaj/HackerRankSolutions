import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//  [[1,3],[2,2],[3,1]]
         int[][] array = new int[][]{{1, 3}, {2, 2}, {3, 1}};
//        int[][] array = new int[][]{{1, 3}, {5, 5}, {2, 5}, {4, 2}, {4, 1}, {3, 1}, {2, 2}, {1, 3}, {2, 5}, {3, 2}};
        System.out.println(maximumUnits(array, 4));
        System.out.println("Sevdemmmmmmmmmm");
    }

    static class Packet implements Comparable<Packet> {
        int numberOFBox;
        int numberOfUnitPerBox;

        public Packet(int numberOFBox, int numberOfUnitPerBox) {
            this.numberOfUnitPerBox = numberOfUnitPerBox;
            this.numberOFBox = numberOFBox;
        }

        @Override
        public int compareTo(Packet p1) {
            return Integer.compare(this.numberOfUnitPerBox, p1.numberOfUnitPerBox);
        }
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        List<Packet> values = new ArrayList<>();
        int totalBoxes = 0;
        int totalUnits = 0;
        int ans = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            values.add(new Packet(boxTypes[i][0], boxTypes[i][1]));
            totalBoxes += values.get(i).numberOFBox;
            totalUnits += values.get(i).numberOFBox * values.get(i).numberOfUnitPerBox;

        }
        Collections.sort(values);
        int boxSize = 0;
        if (truckSize > totalBoxes) {
            return totalUnits;
        } else {
            for (int i = 0; i < values.size(); i++) {
                if (boxSize + values.get(values.size() - i - 1).numberOFBox < truckSize) {
                    boxSize += values.get(values.size() - i - 1).numberOFBox;
                    ans += values.get(values.size() - i - 1).numberOFBox * values.get(values.size() - i - 1).numberOfUnitPerBox;
                } else if (truckSize == boxSize + values.get(values.size() - i - 1).numberOFBox) {
                    ans += values.get(values.size() - i - 1).numberOFBox * values.get(values.size() - i - 1).numberOfUnitPerBox;
                    break;
                } else if (boxSize + values.get(values.size() - i - 1).numberOFBox > truckSize && boxSize < truckSize) {
                    ans += (truckSize - boxSize) * values.get(values.size() - i - 1).numberOfUnitPerBox;
                    break;
                }

            }
            return ans;
        }
    }
}