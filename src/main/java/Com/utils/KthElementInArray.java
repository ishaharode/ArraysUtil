package Com.utils;

import java.util.Arrays;

public class KthElementInArray {

    public static int kthSmallestInArray(int arr[], int K) {
        Arrays.sort(arr);

        return arr[K-1]; // smallest

    }

    public static int kthLargestInArray(int arr[], int K) {
        Arrays.sort(arr);
        int n= arr.length;
        return arr[n-K]; // Largest

    }

}
