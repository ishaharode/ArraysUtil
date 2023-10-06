package Com.utils;
import java.util.ArrayList;
import java.util.List;


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

        //Contains Duplicate
        boolean duplicate= ContainsDuplicate.containsDuplicate(array);
        System.out.println("array contains the duplicate elements = "+duplicate);

        //Find disappeared Numbers in Array
        List<Integer> disappearedNumbers= findDisappearedNumbers.findDisappearedNumbersinArray(array);
        System.out.println("number disappeared in the range of [1,n] ="+disappearedNumbers);

        //remove elements
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<=20;i++)
        {
            arr.add(i);
        }
        RemovingOddElements.removeOddElementfromArray(arr);

    }
}