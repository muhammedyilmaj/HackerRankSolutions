import java.util.Arrays;

public class MergeSort {
    public static void mergesort(int[] array) {
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length - 1);
    }

    public static void mergesort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // Sort left half
            mergesort(array, helper, middle+1, high); // Sort right half
            merge(array, helper, low, middle, high); // Merge them
        }
    }

    public static void merge(int[] array, int[] helper, int low, int middle, int high) {
        /* Copy both halves into a helper array */
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        /* Iterate through helper array. Compare the left and right
         * half, copying back the smaller element from the two halves
         * into the original array. */
        while(helperLeft<=middle && helperRight <= high) {
            if(helper[helperLeft]<=helper[helperRight])
            {
                array[current] = helper[helperLeft];
                helperLeft++;
            }
            else
            {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        /* Copy the rest of the left side of the array into the
         * target array */
        /* We only copy the left side of the array as the right side don't need to do this*/
        int remaining = middle - helperLeft;
        for(int i = 0 ;i<remaining;i++)
            array[current+i] = helper[helperLeft+i];
    }

    public static void main(String[] args) {
        int[] array = {1,2,5,1,7,43,6,4,24,4623,3425,22,4523,55,44,23};
        System.out.println(array);
        mergesort(array);
        System.out.println("new array");
        Arrays.stream(array).forEach(System.out::println);
    }
}