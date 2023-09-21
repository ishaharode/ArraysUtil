package Com.utils;

public class Main {
    public static void main(String[] args) {
/*
        //move zeros to end of an array
        int nums[]={0,1,0,3,12};
        MoveZero.moveZeroes(nums);
*/
        int [] array= {3,2,3,1,2,4,5,5,6};
        //Kth Smallest element
        int K =4;
        int KthSmallest = KthElementInArray.kthSmallestInArray(array,K);
        System.out.println(K+"th Smallest="+KthSmallest);

        //Kth Largest element
        K =5;
        int KthLargest = KthElementInArray.kthSmallestInArray(array,K);

        System.out.println(K+"th Largest="+KthLargest);

    }
}