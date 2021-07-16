public class CatsandMouse {

    static String catAndMouse(int x, int y, int z) {
        int distanceOfFirstCat = calculateLength(x,z);
        int distanceOfSecondCat = calculateLength(y,z);
        if(distanceOfFirstCat < distanceOfSecondCat) {
            return "Cat A";
        } else if (distanceOfFirstCat > distanceOfSecondCat) {
            return "Cat B";
        } else {
            return "Mause C";
        }


    }
    static int calculateLength(int first, int second) {
        if(first >= second) {
            return first - second;
        } else {
            return second - first;
        }

    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(22 ,75, 70));
        System.out.println(catAndMouse(33 ,86, 59));
    }
}
